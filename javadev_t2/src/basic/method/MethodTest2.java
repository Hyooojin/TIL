package basic.method;

public class MethodTest2 {
	
	public static void main(String[] args) {
		print("yongbin"); // 실매개변수
		print("heenam");
		print("hyojin");
	}

	private static void print(String name) { //형식매개변수
		System.out.println("*****************");
		System.out.println("* hello " + name + " *");
		System.out.println("*****************");
	}
}
