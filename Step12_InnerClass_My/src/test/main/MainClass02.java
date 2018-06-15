package test.main;

import test.mypac.Bakery;
import test.mypac.Bakery.Bread;
import test.mypac.Bakery.Cake;

public class MainClass02 {
	public static void main(String[] args) {

//		Bakery b=new Bakery();
//		//Bakery 객체를 이용해서 bread 객체의 참조값 얻어오기
//		Bread bread=b.getBread();
//		//Bakery 객체를 이용해서 cake객체의 참조값 얻어오기
//		Cake cake=b.getCake();
//		
//		//각각 메소드 호출하기
//		bread.eat();
//		
//		cake.eat();
		
		Bread bread=new Bakery().getBread();
		bread.eat();
		Cake cake=new Bakery().getCake();
		cake.eat();
	}
}
