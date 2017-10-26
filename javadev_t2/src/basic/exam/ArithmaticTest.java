package basic.exam;

import java.util.Scanner;

public class ArithmaticTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a; // 자동변수, 로컬변수
		int b;
		
		System.out.print("a : "); a = sc.nextInt();
		System.out.print("b : "); b = sc.nextInt();
		
		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + ((double)a / b));
		System.out.println(a + "%" + b + "=" + (a % b));
	}
}
