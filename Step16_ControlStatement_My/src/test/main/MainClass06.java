package test.main;

import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		Car[] cars=new Car[3];
		cars[0]=new Car("소나타");
		cars[1]=new Car("프라이드");
		cars[2]=new Car("그랜져");
		
		for(int i=0;i<cars.length;i++) {
			Car tmp=cars[i];
			tmp.drive();
		}
		System.out.println("===for 확장문===");
		
		for(Car tmp:cars) {
			tmp.drive();
		}
	}
}
