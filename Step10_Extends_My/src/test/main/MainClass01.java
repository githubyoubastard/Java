package test.main;

import test.mypac.HandPhone;

public class MainClass01 {
	public static void main(String[] args) {
		// 내 필기
		// Phone 클래스를 상속 받은 HandPhone 클래스에는 
		// HandPhone 클래스의 기능과 Phone Class 기능, 그리고 Object 기능을 상속 받기 때문에
		// p. 을 찍어보면 다 나옴
		
		// 선생님 필기
		// Phone 클래스를 상속받은 HandPhone 클래스의 생성자를 호출해서 
		// 객체를 생성한후 참조값을 HandPhone type 변수에 담는다.
		HandPhone p=new HandPhone();
		// Phone 클래스에 정의된 기능
		p.call();
		//HandPhone 클래스에 정의된 기능
		p.takePicture();
		p.mobileCall();
	}
}
