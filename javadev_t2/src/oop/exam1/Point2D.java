package oop.exam1;

public class Point2D {
	public int x=10;
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
		System.out.println("x = " + x);
		System.out.println("y = " + getY());
	}
}
