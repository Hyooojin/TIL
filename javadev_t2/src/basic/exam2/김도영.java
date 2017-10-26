package basic.exam2;

public class 김도영 {
	public static void main(String[] args) {
		for (int a = 0; a < 2; a++) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 2+(4*a); j <= 5+(4*a); j++) {
					System.out.print(j + " X " + i + " = " + (i * j) + '\t');
				}
				System.out.println("");
			}
			System.out.println("");
		}
		
		
	}
}
