package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		Object p1=new SmartPhone();
		// Phone으로 casting 해서 대입
		Phone p2=(Phone)p1;
		HandPhone p3=(HandPhone)p1;
		SmartPhone p4=(SmartPhone)p1;
	}
}
