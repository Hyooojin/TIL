package basic.exam2;

public class ContinueTest {
	public static void main(String[] args) {
		// 1부터 1000까지 정수중 3의 배수의 합계
		int sum = 0;
		
		for(int i=1; i <= 1000; i++) {
			if (i%3 != 0) continue;
			sum += i;
		}

		System.out.println(sum);
	}
}
