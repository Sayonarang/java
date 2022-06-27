package classTest;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car(); //참조 하기 위해서 new 연산자      클래스 변수 선언 
		System.out.println("제작회사 : "+ myCar.company);
		System.out.println("모델명 : "+ myCar.mode1);
		System.out.println("차량색상 : "+ myCar.color);
		myCar.color = "흰색"; //색상을 바꿀 수 있음 
		System.out.println("차량색상 : "+ myCar.color);
		System.out.println("차량최고속도 : "+ myCar.maxspeed);
		System.out.println("차량현재속도 : "+ myCar.speed);
		System.out.println("시동커졌니? : "+ myCar.power);
		
		myCar.speed = 60;
		System.out.println("차량현재속도 : "+ myCar.speed);
	}

}
