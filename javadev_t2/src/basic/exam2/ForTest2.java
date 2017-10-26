package basic.exam2;

public class ForTest2 {
	public static void main(String[] args) {
		// 1부터 3까지 정수의 합
		int sum = 0;
		
		/*for(int i=1; i <= 1000; i++) {
			if (i%3 == 0){
				sum += i;
			}
		}*/
		
		for(int i=0; i <= 1000; i+=3) {
			sum += i;
		}
		System.out.println(sum);
	}
}
