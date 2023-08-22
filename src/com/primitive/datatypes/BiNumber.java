package com.primitive.datatypes;

public class BiNumber {
	private int i, j;

	public BiNumber(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public int add() {
		return i + j;
	}

	public int multiple() {
		return i * j;
	}

	public int getNumber1() {
		return i;
	}

	public void setNumber1(int i) {
		this.i = i;
	}

	public int getNumber2() {
		return j;
	}

	public void setNumber2(int j) {
		this.j = j;
	}

	public void doubleNo() {
		i *= 2;
		j *= 2;
		System.out.println("double of first no is : " + i);
		System.out.println("double of second no is : " + j);
	}

}
