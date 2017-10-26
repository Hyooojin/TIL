package basic.exam;

import java.util.Scanner;

public class Arithmatic2Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 i 입력: ");int i = sc.nextInt();
		System.out.print("정수 j 입력: ");int j = sc.nextInt();
		
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i <= j);
		System.out.println(i == j);
		System.out.println(i != j);
	}
}
