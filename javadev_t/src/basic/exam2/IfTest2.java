package basic.exam2;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 100 점수를 정수로 입력 > ");
		
		int score = sc.nextInt();
		
/*		if (score >= 90) System.out.println("A");
		else if (score >= 80) System.out.println("B");
		else if (score >= 70) System.out.println("C");
		else if (score >= 60) System.out.println("D");
		else System.out.println("F");
*/		
		if (90 <= score && score <= 100) System.out.println("A");
		else if (80 <= score && score <= 89) System.out.println("B");
		else if (70 <= score && score <= 79) System.out.println("C");
		else if (60 <= score && score <= 69) System.out.println("D");
		else if (0  <= score && score <= 59) System.out.println("F");
		
		System.out.println("종료");
	}
}
