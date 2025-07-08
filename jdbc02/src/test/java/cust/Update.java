package cust;

import eud.sm.dto.Cust;
import eud.sm.service.CustService;
import org.junit.jupiter.api.Test;

public class Update {

    @Test
    public void insert(){
        System.out.println("Update Test Start ...");
        CustService custService = new CustService();
        Cust cust = Cust.builder()
                .custId("id56")
                .custPwd("pwd66")
                .custName("고말고")
                .build();
        try {
            custService.modify(cust);
            System.out.println("수정 정상");
        } catch (Exception e) {
            System.out.println("수정 오류");
            e.printStackTrace();
        }
    }
}