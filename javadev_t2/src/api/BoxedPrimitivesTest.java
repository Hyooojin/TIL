package api;

public class BoxedPrimitivesTest {
	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer i2= 10; // java 5nf, auto boxing
		
		int i3 = i;		// java 5nf, auto unboxing
		
		Object i4 = 10; // java 5nf, auto boxing
		int i5 = (int) i4;	// java 7
		int i6 = (Integer) i4; // java 5~6
		int i7 = Integer.parseInt("100");
		long l1 = Long.parseLong("100L");
		
	}
}
