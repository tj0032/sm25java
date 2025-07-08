package eud.sm.service;

import eud.sm.dto.Product;
import eud.sm.frame.ConnectionPool;
import eud.sm.frame.SmService;
import eud.sm.repository.ProductRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ProductService implements SmService<Product, Integer> {

    private ProductRepository productRepository;
    private ConnectionPool connectionPool;

    public ProductService() {
        this.productRepository = new ProductRepository();
        try {
            connectionPool = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException("생성 실패", e);
        }
    }

    @Override
    public void register(Product product) throws Exception {
        Connection conn = connectionPool.getConnection();
        try {
            conn.setAutoCommit(false);
            productRepository.insert(product, conn);
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            throw e;
        } finally {
            if (conn != null) connectionPool.releaseConnection(conn);
        }
    }

    @Override
    public void modify(Product product) throws Exception {
        Connection conn = connectionPool.getConnection();
        try {
            conn.setAutoCommit(false);
            productRepository.update(product, conn);
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            throw e;
        } finally {
            if (conn != null) connectionPool.releaseConnection(conn);
        }
    }

    @Override
    public void remove(Integer productId) throws Exception {
        Connection conn = connectionPool.getConnection();
        try {
            conn.setAutoCommit(false);
            productRepository.delete(productId, conn);
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            throw e;
        } finally {
            if (conn != null) connectionPool.releaseConnection(conn);
        }
    }

    @Override
    public List<Product> get() throws Exception {
        Connection conn = connectionPool.getConnection();
        try {
            return productRepository.selectAll(conn);
        } finally {
            if (conn != null) connectionPool.releaseConnection(conn);
        }
    }

    @Override
    public Product get(Integer productId) throws Exception {
        Connection conn = connectionPool.getConnection();
        try {
            return productRepository.select(productId, conn);
        } finally {
            if (conn != null) connectionPool.releaseConnection(conn);
        }
    }
}
