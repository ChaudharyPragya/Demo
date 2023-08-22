package com.primitive.datatypes;

import java.math.BigDecimal;

public class BigDecimalContent {

	public static void main(String[] args) {
		float f1 = 49.48738762f;
		float f2 = 32.207362f;
		BigDecimal number1 = new BigDecimal("49.48738762");
		BigDecimal number2 = new BigDecimal("32.207362");
		BigDecimal number3 = number1.add(number2);
		float f3 = f1 + f2;
		System.out.println("value from floating number : " + f3);
		System.out.println("Value from decimal number, The sum of given big decimal numbers is : " + number3);
		int i = 12;
		// type casting
		// we cannot add the integer type number with a decimal number so need to
		// convert the integer into BigDecimal as the right hand side value is in
		// BigDecimal
		BigDecimal number4 = number1.add(new BigDecimal(i));
		System.out.println(number4);

	}

}
