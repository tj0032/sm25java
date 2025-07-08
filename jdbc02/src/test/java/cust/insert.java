package cust;

import eud.sm.dto.Cust;
import eud.sm.service.CustService;
import org.junit.jupiter.api.Test;

public class insert {
    @Test
    public void insert() throws Exception {
        System.out.println("insert Test Start...");
        CustService custService= new CustService();
        Cust cust = Cust.builder()
                .custId("id57")
                .custPwd("pwd57")
                .custName("홍말고")
                .build();
        try {
            custService.register(cust);
            System.out.println("등록 정상");
        } catch (Exception e) {
            System.out.println("등록 오류");
            e.printStackTrace();
        }
    }
}
