package product;

import eud.sm.dto.Product;
import eud.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Select {

    @Test
    public void select() {
        ProductService productService = new ProductService();
        Product product = null;

        try {
            product = productService.get(1001);
            System.out.println(product);
        } catch (Exception e) {
            System.err.println("상품 조회 실패");
            e.printStackTrace();
        }
    }
}
