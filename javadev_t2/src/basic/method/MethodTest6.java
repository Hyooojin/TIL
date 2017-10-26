package basic.method;

public class MethodTest6 {
	public static void main(String[] args) {
		print(1);
		print(2,3); // method overloading
		print(4,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,84567454,5,6,23,23,3,4,5,5,6,7,7,64,4,56,8456745);
		
		/*String name = "최지웅";
		print(name);
		System.out.println(name);*/
		int a=10, b=5;
		swapNumber(a, b);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		int[] lotto = {1,2,3,4,5,6};
		swapRandom(lotto);
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
	}

	//기본자료형은 값을 수정시 리턴후 원래 값
	private static void swapNumber(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	//참조자료형은 값을 수정시 리턴후에도 값이 바뀜
	private static void swapRandom(int[] lotto) {
		int temp = lotto[0];
		lotto[0] = lotto[5];
		lotto[5] = temp;
	}

	private static void print(String name) {
		name = "박병규";
	}

	private static void print(int... i) {
		for(int j:i) {
			System.out.print(j + "\t");
		}
		System.out.println();
	}

/*	private static void print(int i, int j, int k) {
		System.out.println(i + "\t" + j + "\t" + k);
	}
	
	private static void print(int i, int j) {
		System.out.println(i + "\t" + j);
	}

	private static void print(int i) {
		System.out.println(i);
	}
*/}
