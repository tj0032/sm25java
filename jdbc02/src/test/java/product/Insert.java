package product;

import eud.sm.dto.Cust;
import eud.sm.dto.Product;
import eud.sm.service.CustService;
import eud.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Insert {

    @Test
    public void insert(){
        System.out.println("insert Test Start ...");
        ProductService productService = new ProductService();
        Product product = Product.builder().productName("바지2").productPrice(100).discountRate(0.2).cateId(10).productImg("bb.jpg").build();
        try {
            productService.register(product);
            System.out.println("등록 정상");
        } catch (Exception e) {
            System.out.println("등록 오류");
            e.printStackTrace();
        }
    }
}