package basic.exam2;

import java.util.Scanner;

public class 권보영 {
   public static void main(String[] args) {
      String[] caption = {"가위","바위","보"};
      System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요>>");
      Scanner sc = new Scanner(System.in);

      int me = sc.nextInt();
      System.out.println("you : " + caption[me-1]);

      int com = (int) (Math.random() * 3) + 1;
      System.out.println("com : " + caption[com-1]);

      int result = me - com;

      switch (result) {
      case 1:
      case -2:
         System.out.println("당신의 승리");
         break;
      case 0:
         System.out.println("무승부");
         break;
      case -1:
      case 2:
         System.out.println("컴퓨터의 승리");
         break;
      default:
         System.out.println("에러");
         break;
      }
      sc.close();
   }
}