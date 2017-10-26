package basic.exam2;

import java.util.Scanner;

public class 박종봉 {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요 > ");
      int n = s.nextInt();

      int c = (int) Math.random() * 3 + 1;
      String[] rsp = { "가위", "바위", "보" };
      System.out.println("you : " + rsp[n - 1]);
      System.out.println("com : " + rsp[c - 1]);
      String[] result = { "무승부", "당신의 승리", "컴퓨터의 승리" };
      switch (c) {
      case 1:
         switch (n) {
         case 1:
            System.out.print(result[0]);
            break;
         case 2:
            System.out.print(result[1]);
            break;
         case 3:
            System.out.print(result[2]);
            break;
         }
         break;
      case 2:
         switch (n) {
         case 1:
            System.out.print(result[2]);
            break;
         case 2:
            System.out.print(result[0]);
            break;
         case 3:
            System.out.print(result[1]);
            break;
         }
         break;
      case 3:
         switch (n) {
         case 1:
            System.out.print(result[1]);
            break;
         case 2:
            System.out.print(result[2]);
            break;
         case 3:
            System.out.print(result[0]);
            break;
         }
         break;
      }
      System.out.println("입니다.");
   }
}