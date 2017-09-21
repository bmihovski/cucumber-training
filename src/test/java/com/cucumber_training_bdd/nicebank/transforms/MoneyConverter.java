package com.cucumber_training_bdd.nicebank.transforms;

import cucumber.api.Transformer;
import com.cucumber_training_bdd.nicebank.step_definitions.*;

public class MoneyConverter extends Transformer<Money>{
	public Money transform(String amount) {
		String[] numbers =  amount.substring(1).split("\\.");
		
		int dollars = Integer.parseInt(numbers[0]);
		int cents = Integer.parseInt(numbers[1]);
		
		return new Money(dollars, cents);
		
	}

}
