package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		//HandPhone 객체 생성해서 HandPhone type 변수에 대입.
		HandPhone hPhone=new HandPhone();
		
		// 문법은 맞지만 Exception 오류 발생!
		// 무조건 캐스팅한다고 해서 작동되는건 아님.
		// 원래 기능이 있는 것을 캐스팅해야됨. hPhone에는 doInternet method가 없기 때문에
		// 사용자가 SmartPhone 설명서를 가지고 와서 hPhone에 casting을 한다 한들 
		// 없던 doInternet method 생기진 않음
		SmartPhone p1=(SmartPhone)hPhone;
		p1.doInternet();
	}
}
