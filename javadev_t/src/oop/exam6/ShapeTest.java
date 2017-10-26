package oop.exam6;

public class ShapeTest {
	public static void main(String[] args) {
		printArea(new Circle());
		printArea(new Rectangle());
		printArea(new Triangle());
	}

	private static void printArea(Shape s) {
		s.area();
		if (s instanceof Circle) {
			Circle c = (Circle)s;
			//c.size();
			System.out.println(
					"반지름이 " + c.r + "인 원의 넓이는 " + c.res);
		} else if (s instanceof Rectangle) {
			Rectangle r = (Rectangle)s;
			System.out.println(
					"가로가 " + r.w + ",세로가 " + r.h +
					"인 사각형의 넓이는 " + r.res);
		} else if (s instanceof Triangle) {
			Triangle t = (Triangle)s;
			System.out.println(
					"밑변이 " + t.w + ",높이가 " + t.h +
					"인 삼각형의 넓이는 " + t.res);
		}
	}
}
