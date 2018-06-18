package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;
import test.mypac.Person;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * Generic 클래스를 Object로 하면 어떤 type이든
		 * 다 저장 할 수 있지만 여려개의 type을 섞어서 저장하는 경우는 없다고 보면 된다.
		 */
		List<Object> list=new ArrayList<>();
		// 아래와 같이 여러 타입을 저장하는 경우는 없다..... 
		// 오직 한가지만 딱 찍어서 저장해야 한다. 
		// 여러 타입을 저장 할 수 있다는 것만 보여준 거임;
		
		list.add(10);  //Integer 타입 저장
		list.add(10.1); //Double 타입 저장
		list.add(true); //Boolean 타입 저장
		list.add("유수열"); //String 타입 저장
		list.add(new Person()); // Person 타입 저장
		list.add(new Car());		// Car 타입 저장
	}
}
