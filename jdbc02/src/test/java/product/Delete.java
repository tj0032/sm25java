package product;

import eud.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Delete {

    @Test
    public void delete() {
        System.out.println("Product Delete Test Start...");
        ProductService productService = new ProductService();
        try {
            productService.remove(1002);
            System.out.println("삭제 성공");
        } catch (Exception e) {
            System.out.println("삭제 실패");
            e.printStackTrace();
        }
    }
}
