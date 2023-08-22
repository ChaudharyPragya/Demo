package com.primitive.datatypes;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(2, 3);
		System.out.println("Sum of " + numbers.getNumber1() + " and " + numbers.getNumber2() + " is " + numbers.add());
		System.out.println(
				"product of " + numbers.getNumber1() + " and " + numbers.getNumber2() + " is " + numbers.multiple());
		numbers.doubleNo();
		System.out.println("the first no. is : " + numbers.getNumber1());
		System.out.println("the second no. is : " + numbers.getNumber2());

	}

}
