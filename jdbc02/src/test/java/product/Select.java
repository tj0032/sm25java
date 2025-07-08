package product;

import eud.sm.dto.Cust;
import eud.sm.dto.Product;
import eud.sm.service.CustService;
import eud.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Select {
    @Test
    public void select(){
        System.out.println("Select1 Test Start ...");

        ProductService productService = new ProductService();
        Product product = null;
        try {
            product = productService.get(1003);
            System.out.println(product);
        } catch (Exception e) {
            System.err.println("조회 실패");
        }
    }

}