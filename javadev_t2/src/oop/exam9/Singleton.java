package oop.exam9;
/*
 Singleton 클래스 만드는 순서
 1. 생성자의 접근제어자를 private으로 만든다 :
    아무곳에서나 인스턴스 생성하는 것을 금지
 2. 자기 자신의 인스턴스를 참조하는 공유변수를 선언하고
    인스턴스를 생성후 참조
 3. 공유변수를 리턴하는 getter메소드 작성
 4. 사용 : 수행하는 클래스에서 new 없는 상태로
    클래스이름.getter메소드() 형태로 인스턴스를 불러와서 참조
 */

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton(){}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
	@Override
	public String toString() {
		return "포기하는 그 순간 시험종료다~!!!";
	}
}


