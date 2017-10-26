package basic.method;

import java.util.Scanner;

public class MethodTest5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요 > ");
		int you = sc.nextInt();
		int com = (int)(Math.random() * 3) + 1;
		
		System.out.println("You : " + caption(you));
		System.out.println("Com : " + caption(com));
		
		switch ((you - com + 3) %3) {
		case 1:
			System.out.println("당신의 승리입니다");break;
		case 2:
			System.out.println("당신의 패배입니다");break;
		default:
			System.out.println("무승부입니다.");break;
		}		
/*		if ((you == 1 && com == 3)||
			(you == 2 && com == 1)||
			(you == 3 && com == 2)) {
			System.out.println("당신의 승리입니다");
		} else if (you == com) {
			System.out.println("비겼습니다");
		} else {
			System.out.println("당신의 패배입니다");
		}*/
		
		

	}

	private static String caption(int value) {
		switch (value) {
		case 1:return "가위";
		case 2:return "바위";
		default:return "보";
		}
	}
}
