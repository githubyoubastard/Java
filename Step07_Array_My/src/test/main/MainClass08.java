package test.main;

import test.auto.Car;

public class MainClass08 {
	public static void main(String[] args) {
		// car type을 담을 수 있는 방 5개 짜리 배열 객체를 생성해 보세요
		Car[] ride=new Car[5];
		// 0번방의 car 객체의 참조값을 대입해 보세요
		ride[0]=new Car();
		// 1번방에 car 객체의 참조값을 대입해 보세요.
		ride[1]=new Car();
		// Car 객체를 생성해서 참조값을 변수에 담기
		Car a=new Car();
		// 2번방과 3번방에 c라는 변수에 있는 참조값을 대입.
		ride[2]=a;
		ride[3]=a;
		//0번방에 있는 참조값을 4번방에 대입.
		ride[4]=ride[0];
	}
}
