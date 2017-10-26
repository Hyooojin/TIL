### 클래스와 인스턴스 생성 후 실행

1. oop.exam2 package를 생성
2. 클래스 Point2D 생성

package oop.exam2;

public class Point2D {
	int x;
	int y;
}

3. 클래스 PointTest 생성
package oop.exam2;

public class PointTest {
	public static void main(String[] args) {
		Point2D pt = new Point2D();
		pt.x = 1000;
		pt.y = 2000;
		System.out.println("x = " + pt.x);
		System.out.println("y = " + pt.y);
	}
}

### 클래스 Point2D에 Encapsulation & Information Hiding을 적용
1. Point2D의 멤버변수 x,y에 private을 적용후 getter/setter 생성
package oop.exam2;

public class Point2D {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

2. Encapsulation 이 적용된 Point2D를 사용
public class PointTest {
	public static void main(String[] args) {
		Point2D pt = new Point2D();
		pt.setX(1000);
		pt.setY(2000);
		System.out.println("x = " + pt.getX());
		System.out.println("y = " + pt.getY());
	}
}

### 상속 
1. 클래스 Point2D를 상속한 Point3D를 생성

package oop.exam2;

public class Point3D extends Point2D {
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
}

2. 상속이 적용된 Point3D 클래스의 사용
package oop.exam2;

public class PointTest {
	public static void main(String[] args) {
		Point3D pt = new Point3D();
		pt.setX(1000);
		pt.setY(2000);
		pt.setZ(3000);
		
		System.out.println("x = " + pt.getX());
		System.out.println("y = " + pt.getY());
		System.out.println("z = " + pt.getZ());
	}
}

### 오버라이딩을 적용
1. Point2D에 print() 메소드 작성
package oop.exam2;

public class Point2D {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void print() {
		System.out.println("x = " + this.getX());
		System.out.println("y = " + this.getY());
	}
}

2. Point3D에 print() 를 overriding
package oop.exam2;

public class Point3D extends Point2D {
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void print() {
		super.print();
		System.out.println("z = " + this.getZ());
	}
}

3. PointTest 수행
package oop.exam2;

public class PointTest {
	public static void main(String[] args) {
		Point3D pt = new Point3D();
		pt.setX(1000);
		pt.setY(2000);
		pt.setZ(3000);
		pt.print();
	}
}









