package product;

import eud.sm.dto.Product;
import eud.sm.service.ProductService;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

public class Insert {

    @Test
    public void insert() throws Exception {
        System.out.println("Product Insert Test Start...");
        ProductService productService = new ProductService();

        Product product = Product.builder()
                .productName("청바지")
                .productPrice(25000)
                .discountRate(0.15)
                .productImg("j1.jpg")
                .cateId(10)
                .productRegdate(new Timestamp(System.currentTimeMillis()))
                .productUpdate(new Timestamp(System.currentTimeMillis()))
                .build();

        try {
            productService.register(product);
            System.out.println("등록 성공!");
        } catch (Exception e) {
            System.out.println("등록 실패!");
            e.printStackTrace();
        }
    }
}
