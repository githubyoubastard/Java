package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

/*
 *  [ 다형성(Polymorphism) ]
 *   
 *   - java에서 객체의 참조값은 다형성을 가질 수 있다.
 *   - 다형성이란 여러가지 type이 될 수 있다는 의미이다.
 * 
 */

public class MainClass03 {
	public static void main(String[] args) {
		//SmartPhone 객체의 참조값을 부모 type변수에 대입하기
		//P1에 . 찍으면 Object에 정의된 기능만 사용가능
		Object p1=new SmartPhone();
		//P2에 . 찍으면 Object, phone에 정의된 기능만 사용가능
		Phone p2=new SmartPhone();
		//P3에 . 찍으면 Object, phone, handPhone에 정의된 기능만 사용가능
		HandPhone p3=new SmartPhone();
		//SmartPhone 객체의 참조값을 Smartphone type변수에 대입하기
		//P4에 . 찍으면 부모에 정의된 모든 기능 사용가능
		SmartPhone p4=new SmartPhone();
	}
}
