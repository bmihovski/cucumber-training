package com.cucumber_training_bdd.nicebank.step_definitions;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import com.cucumber_training_bdd.nicebank.transforms.MoneyConverter;

import cucumber.api.Transform;

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
		public void dispense(int dollars) {
			contents = dollars;
		}
	}

	KnowsMyAccount helper;

	public NicebankSteps() {
		helper = new KnowsMyAccount();
	}

}
