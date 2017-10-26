package basic.exam;

public class ConversionTest {
	public static void main(String[] args) {
//		double d = 10;		// 자동 형변환(묵시적 형변환)
//		System.out.println(d);
//		
//		int i = (int) 3.994;// 강제 형변환(명시적 형변환)
//		System.out.println(i);
//		int n = (int)(Math.random() * 6) + 1;
//		int n = (int)(Math.random() * 12) + 4;
		int n = ((int)(Math.random() * 17) + 6) * 100;
		System.out.println(n);
	}
}
