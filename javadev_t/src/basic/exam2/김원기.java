package basic.exam2;

import java.util.Scanner;

public class 김원기 {
   public static void main(String[] args) {
      
      String[] Caption = {"가위", "바위", "보" };
      
      
      Scanner sc = new Scanner(System.in);
      System.out.println("1: 가위 2: 바위 3: 보 입력 >> ");
      
      int me = sc.nextInt();
      int computer;
      
      computer = (int) (Math.random() * 3 + 1);
      
      
      System.out.println("Me: " + Caption[me-1]);
      System.out.println("Computer: " + Caption[computer-1]);
      
      if (me - computer == 0){
         System.out.println(" 무승부 ");
      }
      else if (me - computer == -1 || me - computer == -2){
         System.out.println(" 컴퓨터 이김");      
      }
      else{
         System.out.println(" 내가 이김");
      }
   }
}