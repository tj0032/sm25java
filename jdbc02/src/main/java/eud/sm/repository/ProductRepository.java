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
        try (PreparedStatement psmt = conn.prepareStatement(ProductSql.insert)) {
            psmt.setString(1, product.getProductName());
            psmt.setInt(2, product.getProductPrice());
            psmt.setDouble(3, product.getDiscountRate());
            psmt.setString(4, product.getProductImg());
            psmt.setInt(5, product.getCateId());
            psmt.executeUpdate();
        }
    }

    @Override
    public void update(Product product, Connection conn) throws Exception {

    }

    @Override
    public void delete(Integer productId, Connection conn) throws Exception {

    }

    @Override
    public List<Product> selectAll(Connection conn) throws Exception {
        List<Product> result = new ArrayList<>();

        try (
                PreparedStatement psmt = conn.prepareStatement(ProductSql.selectAll);
                ResultSet rs = psmt.executeQuery()
        ) {
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
        }

        return result;
    }

    @Override
    public Product select(Integer productId, Connection conn) throws Exception {

        return null;
    }
}
