package oop.exam4;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
//		System.out.println(animal);
		
		//sub type 인스턴스는 super type으로 참조 가능
		// 자동형변환(묵시적형변환) ※ Up casting
		Animal animal2 = new Eagle(); 
		System.out.println(animal2);
		
		//Bird bird = (Bird) animal; // RuntimeException
		//System.out.println(bird);
		
		//다운캐스팅은 강제 형변환(명시적 형변환)이 필요
		//down casting은 원 인스턴스의 타입이
		//캐스팅 하려는 타입이거나 캐스팅 타입의 서브타입이어야 함.
		Animal eagle = new Eagle();
//		Bird bird2 = (Bird) eagle;
//		System.out.println(bird2);
//		Eagle eagle2 = (Eagle) eagle;
//		System.out.println(eagle2);
//		Condor condor2 = (Condor) eagle;
//		System.out.println(condor2);
		// 업캐스팅 다운캐스팅은 상속관계에서만 가능
		
		Tiger tiger = (Tiger) eagle;
		System.out.println(tiger);

	}
}
