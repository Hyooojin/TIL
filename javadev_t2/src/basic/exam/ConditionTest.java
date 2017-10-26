package basic.exam;

public class ConditionTest {
	public static void main(String[] args) {
		int n = 4;
		System.out.println(
				n == 1 || n == 3 ? "남자" : 
				n == 2 || n == 4 ? "여자" : 
								   "에러");
	}
}
