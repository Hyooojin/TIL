package basic.exam2;

public class DoWhileTest {
	public static void main(String[] args) {
		int i,j;
		i = (int)(Math.random() * 6) + 1;
		do {
			j = (int) (Math.random() * 6) + 1;
		} while (j == i);
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
	}
}
