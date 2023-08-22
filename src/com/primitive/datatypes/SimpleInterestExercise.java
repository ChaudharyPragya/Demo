package com.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestExercise {

	public static void main(String[] args) {
		InterestCalculation calculator = new InterestCalculation("4500.0", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println("total principal amount : " + totalValue);

	}

}
