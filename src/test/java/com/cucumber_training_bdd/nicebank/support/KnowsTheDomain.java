package com.cucumber_training_bdd.nicebank.support;

import com.cucumber_training_bdd.nicebank.step_definitions.NicebankSteps.Account;
import com.cucumber_training_bdd.nicebank.step_definitions.NicebankSteps.CashSlot;
import com.cucumber_training_bdd.nicebank.step_definitions.NicebankSteps.Teller;

public class KnowsTheDomain {
    private Account myAccount;
    private Teller teller;
    private CashSlot cashSlot;

    public Account getMyAccount() {
/*      if (myAccount == null){
        myAccount = new Account();
      }*/

      return myAccount;
    }

    public Teller getTeller() {
/*      if (teller == null){
        teller = new Teller(getCashSlot());
      }
*/
      return teller;
    }

    public CashSlot getCashSlot() {
/*      if (cashSlot == null){
        cashSlot = new CashSlot();
      }*/
  
      return cashSlot;
    }
}
