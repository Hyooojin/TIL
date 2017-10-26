package api;

public class StringTest2 {
	public static void main(String[] args) {
		String str1 = "안녕하세요";
		String str2 = "안녕하세요";
		
		if (str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		if (str1.equals(str2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		String str3 = new String("안녕하세요2");
		String str4 = new String("안녕하세요2");
		
		if (str3 == str4) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if (str3.equals(str4)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
}
