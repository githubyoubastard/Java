package test.main;

import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
						//Car()의 ()는 Car라는 생성자(Constructor)를 호출하는 표현방식이다.
		Car c1=new Car(); 
		Car c2=new Car("소나타");
		Car c3=new Car("프라이드"); 
		Car c4=new Car(999); 
		Car c5=new Car();
		
		c1.drive();
		c2.drive();
		c3.drive();
	}
}
