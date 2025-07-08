package eud.sm.repository;

import eud.sm.dto.Product;
import eud.sm.frame.ProductSql;
import eud.sm.frame.SmRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements SmRepository<Product, Integer> {

    @Override
    public void insert(Product product, Connection conn) throws Exception {
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement(ProductSql.insert);
            psmt.setString(1, product.getProductName());
            psmt.setInt(2, product.getProductPrice());
            psmt.setDouble(3, product.getDiscountRate());
            psmt.setString(4, product.getProductImg());
            psmt.setInt(5, product.getCateId());
            psmt.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (psmt != null) psmt.close();
        }
    }

    @Override
    public void update(Product product, Connection conn) throws Exception {
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement(ProductSql.update);
            psmt.setString(1, product.getProductName());
            psmt.setInt(2, product.getProductPrice());
            psmt.setDouble(3, product.getDiscountRate());
            psmt.setString(4, product.getProductImg());
            psmt.setInt(5, product.getCateId());
            psmt.setInt(6, product.getProductId());
            psmt.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (psmt != null) psmt.close();
        }
    }

    @Override
    public void delete(Integer productId, Connection conn) throws Exception {
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement(ProductSql.delete);
            psmt.setInt(1, productId);
            psmt.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (psmt != null) psmt.close();
        }
    }

    @Override
    public List<Product> selectAll(Connection conn) throws Exception {
        List<Product> result = new ArrayList<>();
        PreparedStatement psmt = null;
        ResultSet rs = null;

        try {
            psmt = conn.prepareStatement(ProductSql.selectAll);
            rs = psmt.executeQuery();
            while (rs.next()) {
                Product product = Product.builder()
                        .productId(rs.getInt("product_id"))
                        .productName(rs.getString("product_name"))
                        .productPrice(rs.getInt("product_price"))
                        .discountRate(rs.getDouble("discount_rate"))
                        .productImg(rs.getString("product_img"))
                        .productRegdate(rs.getTimestamp("product_regdate"))
                        .productUpdate(rs.getTimestamp("product_update"))
                        .cateId(rs.getInt("cate_id"))
                        .build();
                result.add(product);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (psmt != null) psmt.close();
            if (rs != null) rs.close();
        }

        return result;
    }

    @Override
    public Product select(Integer productId, Connection conn) throws Exception {
        Product product = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        try {
            psmt = conn.prepareStatement(ProductSql.select);
            psmt.setInt(1, productId);
            rs = psmt.executeQuery();
            if (rs.next()) {
                product = Product.builder()
                        .productId(rs.getInt("product_id"))
                        .productName(rs.getString("product_name"))
                        .productPrice(rs.getInt("product_price"))
                        .discountRate(rs.getDouble("discount_rate"))
                        .productImg(rs.getString("product_img"))
                        .productRegdate(rs.getTimestamp("product_regdate"))
                        .productUpdate(rs.getTimestamp("product_update"))
                        .cateId(rs.getInt("cate_id"))
                        .build();
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (psmt != null) psmt.close();
            if (rs != null) rs.close();
        }

        return product;
    }
}
