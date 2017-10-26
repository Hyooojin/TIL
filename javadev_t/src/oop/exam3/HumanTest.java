package oop.exam3;

public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		
		h.setName("이용빈");
		h.setGender(1);
		h.setYear(1987);
		h.setJob("BigData 분석가");
		h.setMarried(true);
		h.setWeight(70);
		h.setHeight(168);
		h.setHobby("서예");
		System.out.println(h);
		
		AnimalLover al = new AnimalLover();
		al.setName("JB");
		al.setGender(1);
		al.setYear(1991);
		al.setJob("AI 트레이딩 알고리즘 개발자");
		al.setMarried(true);
		al.setWeight(70);
		al.setHeight(180);
		al.setHobby("테니스");
		al.setAnimalType("고양이");
		al.setAyear(2016);
		System.out.println(al);
	}
}
