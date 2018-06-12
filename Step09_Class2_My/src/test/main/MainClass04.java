package test.main;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		//1. Car 객체를 담을 수 있는 방 3개짜리 배열 객체를 생성해서
			Car[] rooms=new Car[3];
		//2. 배열에 각각 방에 차 이름이
		// "소나타", "프라이드", "그랜져"인 Car 객체의 참조값을 저장하고
			rooms[0]=new Car("소나타");
			rooms[1]=new Car("프라이드");
			rooms[2]=new Car("그랜져");
		
		//3. For 문을 이용해서 배열에 저장된 Car 객체의 drive()라는 메소드를 순서대로 호출해보세요.
			for(int i=0;i<rooms.length;i++) {
				rooms[i].drive();
			}
	}
}
