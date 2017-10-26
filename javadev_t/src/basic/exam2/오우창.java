package basic.exam2;

public class 오우창 {
	public static void main(String[] args) {
		for (int n = 1; n <= 2; n++) {

			for (int i = 1; i <= 9; i++) {

				for (int j = 2; j <= 5; j++) {
					System.out.print(j + 4 * (n - 1) + " * " + i + " = " + i * (j + 4 * (n - 1)) + "\t");
				}

				System.out.println(" ");

			}

			System.out.println("====== ");

		}
	}
}
