package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass07 {
	public static void main(String[] args) {
		Phone p1=new Phone();
		HandPhone p2=new HandPhone();
		SmartPhone p3=new SmartPhone();
		// 변수로 메소드를 호출하면서 참조값 전달.
		
		MainClass07.usePhone(p1); // Phone p=p1
		MainClass07.usePhone(p2); // Phone p=p2
		MainClass07.usePhone(p3); // Phone p=p3 
		
		// 객체를 즉시 생성하고 메소드를 호출하면서 참조값 전달
		MainClass07.usePhone(new Phone());
		MainClass07.usePhone(new HandPhone());
		MainClass07.usePhone(new SmartPhone());
		
		//문법상은 널값을 전달할 수 있다 하지만 p.call() 기능은 못한다. (Nullexpection 오류 뜸)
		MainClass07.usePhone(null);
	}
	public static void usePhone(Phone p) {
		p.call();
	}
}
