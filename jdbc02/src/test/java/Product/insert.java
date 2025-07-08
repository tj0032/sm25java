package Product;

import eud.sm.dto.Product;
import eud.sm.service.ProductService;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

public class insert {
    @Test
    public void insert() throws Exception {
        System.out.println("Product Insert Test Start...");
        ProductService productService = new ProductService();
        Product product = Product.builder()
                .productName("고양이 사료")
                .productPrice(12000)
                .discountRate(0.1)
                .productImg("cat_food.png")
                .cateId(1)
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
