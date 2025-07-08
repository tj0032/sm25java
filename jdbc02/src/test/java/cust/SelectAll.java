package cust;

import eud.sm.dto.Cust;
import eud.sm.frame.ConnectionPool;
import eud.sm.service.CustService;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SelectAll {
    @Test
    public void selectAll() throws Exception {
        CustService custService = new CustService();
        List<Cust> lists = null;
        try {
            lists = custService.get();
            lists.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("조회 실패");
        }
    }
}
