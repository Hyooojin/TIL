package oop.exam7;

public class Point3D extends Point2D {
	int z;
	
	public Point3D(){
		this(100, 200, 300);
		System.out.println("Point3D()");
	}

	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
		System.out.println("Point3D(x,y,z)");
	}
	
	
}
