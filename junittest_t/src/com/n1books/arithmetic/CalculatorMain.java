package com.n1books.arithmetic;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(10);
		System.out.println(c.getResult());
		c.sub(5);
		System.out.println(c.getResult());
		c.mul(5);
		System.out.println(c.getResult());
		c.div(2);
		System.out.println(c.getResult());
	}
}
