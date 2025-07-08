package product;

import eud.sm.dto.Product;
import eud.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Update {

    @Test
    public void update() {
        System.out.println("Product Update Test Start ...");
        ProductService productService = new ProductService();

        Product product = Product.builder()
                .productId(1002)
                .productName("트레이닝 팬츠")
                .productPrice(25000)
                .discountRate(0.2)
                .productImg("pants_update.jpg")
                .cateId(30)
                .build();

        try {
            productService.modify(product);
            System.out.println("수정 성공");
        } catch (Exception e) {
            System.out.println("수정 실패");
            e.printStackTrace();
        }
    }
}
