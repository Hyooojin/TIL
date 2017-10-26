package basic.exam2;

public class 이희남 {
	public static void main(String[] args) {
		//주석
		for (int i = 0; i <= 4; i+=4) {
			for (int j = 1; j <= 9; j++) {
				for (int k = 2; k <= 5; k++) {
					System.out.print((k+i) + "x" + j + "=" + (k+i) * j + "\t");
					}
				System.out.println();
		
			}
			System.out.println();

		}
	}
}
