package eud.sm.service;

import eud.sm.dto.Cust;
import eud.sm.frame.SmService;
import eud.sm.repository.CustRepository;
import java.util.List;

public class CustService implements SmService<Cust, String> {

   CustRepository custRepository;

   public CustService() {
       this.custRepository = new CustRepository();
   }



}
