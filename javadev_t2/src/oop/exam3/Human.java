package oop.exam3;

public class Human {
	private String name;
	private int gender; 	// 주민번호7번째 자리
	private int year;			// 태어난 년도
	private String job;			// 직장
	private boolean married;	// 미혼:true, 기혼:false
	private int weight;			// 몸무게
	private int height;			// 키
	private String hobby;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return name + " 회원님은 " + whatGender() + "이며\n" +
	           "출생년도는 " + year + "년 이며 직업은 " + job + "이고\n" +
			   whatMarried() + "이며 체중은 " + weight + "이고\n" +
	           "키는 " + height + ", 취미는 " + hobby + "입니다.";
	}
	private String whatMarried() {
		return married ? "미혼" : "기혼";
	}
	private String whatGender() {
		return gender == 1 || gender == 3 ? "남성" :
			   gender == 2 || gender == 4 ? "여성" :
				   							"에러";
	}
	
}
