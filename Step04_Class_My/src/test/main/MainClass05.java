package test.main;

import test.mypac.AttackUnit;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * AttackUnit 클래스로 객체를 3개 생성해서
		 * 참조값을 각각 다른 지역 변수에 담고 
		 * attack() 메소드를 한번씩 호출해 보세요
		 */
		AttackUnit a=new AttackUnit();
		AttackUnit b=new AttackUnit();
		AttackUnit c=new AttackUnit();
		
		a.attack();
		b.attack();
		c.attack();
	}	
}
