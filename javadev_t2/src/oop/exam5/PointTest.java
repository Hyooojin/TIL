package oop.exam5;

public class PointTest {
	public static void main(String[] args) {
		Point2D up = new Point3D();
		up.x = 100;
		up.y = 200;
		//up.z = 300;
		
		Point3D dn = (Point3D) up;
		dn.x = 1000;
		dn.y = 2000;
		dn.z = 3000;
	}
}
