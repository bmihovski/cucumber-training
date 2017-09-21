package com.cucumber_training_bdd.nicebank.step_definitions;

public class NicebankSteps {
    public class Account {
        private Money balance = new Money();

        public void deposit(Money amount) {
            balance = balance.add(amount);
        }

        public Money getBalance() {
          return balance;
        }
    }

    public class Teller {
        private CashSlot cashSlot;

        public Teller(CashSlot cashSlot) {
            this.cashSlot = cashSlot;
        }

        public void withdrawFrom(Account account, int dollars) {
            cashSlot.dispense(dollars);
        }
    }

    public class CashSlot {
        private int contents;

        public int getContents() {
            return contents;
        }

        public void dispense(int dollars){
            contents = dollars;
        }
    }

    class KnowsTheDomain {
        private Account myAccount;
        private Teller teller;
        private CashSlot cashSlot;

        public Account getMyAccount() {
          if (myAccount == null){
            myAccount = new Account();
          }

          return myAccount;
        }
    
        public Teller getTeller() {
          if (teller == null){
            teller = new Teller(getCashSlot());
          }

          return teller;
        }

        public CashSlot getCashSlot() {
          if (cashSlot == null){
            cashSlot = new CashSlot();
          }
      
          return cashSlot;
        }
    }
}
