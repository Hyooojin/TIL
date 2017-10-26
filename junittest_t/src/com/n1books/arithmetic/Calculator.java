package com.n1books.arithmetic;

public class Calculator {
	private static int result;
	
	public void clear() {
		result = 0;
	}
	
	public void add(int n) {
		result += n;
	}
	
	public void sub(int n) {
		result -= n;
	}

	public void mul(int n) {
		result *= n;
	}

	public void div(int n) {
		result /= n;
	}

	public static int getResult() {
		return result;
	}
}
