package test.main;

import test.auto.Car;

public class MainClass09 {
	public static void main(String[] args) {
		Car[] cars=new Car[3];
		cars[0]=new Car();
		cars[1]=new Car();
		
		//0번방 1번방에 들어있는 Car 객체의 메소드를 대입
		cars[0].drive();
		cars[1].drive();
		//2번방은 비어 있으므로 null 오류 발생
		cars[2].drive();
		//3번방은 위에서 2번방까지 셋팅을 하였으므로, 오류(exception)뜸
		cars[3]=new Car();
	}
}
