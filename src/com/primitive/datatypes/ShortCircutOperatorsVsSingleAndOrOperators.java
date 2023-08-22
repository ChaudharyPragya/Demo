package com.primitive.datatypes;

public class ShortCircutOperatorsVsSingleAndOrOperators {

	public static void main(String[] args) {
		int i = 5;
		int j = 6;
		int k = 9;
		// shortCircutOpererators
		if (i < 5 && j++ > 6) {
//double && operator will evaluate the condition over right hand side of operator only if the right hand side condition is true
		}
		System.out.println("j becomes : " + j);
		if (i < 5 & j++ > 6) {
//single & operator will evaluate all the conditions no matter the first condition is false or true
		}
		System.out.println("j becomes : " + j);

		System.out.println(i & j);
		if (i < 5 || j++ > 6) {
//"||" is a simple or operator that will give true when atleast one condition is true and false when all the conditions are false
		}
		System.out.println("j becomes : " + j);
		if (i < 5 | j++ > 6) {
//single "|" or operator will act as double "||" or operator when place between conditions 
		}
		System.out.println("j becomes : " + j);

		System.out.println(i | j);
		// single "|" operator is act as a bit wise operator when placed between
		// integers, it will convert the numbers in binary then perform "or" operation
		// like 0 0 = 0 and 0 1=1
	}
}
