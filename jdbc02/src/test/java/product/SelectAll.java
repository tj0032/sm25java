package product;

import eud.sm.dto.Product;
import eud.sm.service.ProductService;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SelectAll {

    @Test
    public void selectAll() throws Exception {
        ProductService productService = new ProductService();
        List<Product> productList = null;

        try {
            productList = productService.get();
            productList.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("상품 전체 조회 실패");
            e.printStackTrace();
        }
    }
}
