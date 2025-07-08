package lombock;


import eud.sm.dto.Cust;
import org.junit.jupiter.api.Test;

public class LombockTest {
    @Test
    public void test1() {
        System.out.println("Test...");
        Cust cust = Cust.builder()
                .custId("id33")
                .custPwd("pwd33")
                .custName("홍말자")
                .build();
        System.out.println(cust);
    }
    @Test
    public void test2() {
        System.out.println("Test2...");
    }
}

















