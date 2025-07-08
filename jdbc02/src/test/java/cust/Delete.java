package cust;

import eud.sm.dto.Cust;
import eud.sm.service.CustService;
import org.junit.jupiter.api.Test;

public class Delete {

    @Test
    public void insert(){
        System.out.println("delete Test Start ...");
        CustService custService = new CustService();
        try {
            custService.remove("id56");
            System.out.println("삭제 정상");
        } catch (Exception e) {
            System.out.println("삭제 오류");
            e.printStackTrace();
        }
    }
}