package test.main;
import test.mypac.AttackUnit;

public class MainClass03 {
	public static void main(String[] args) {

		/*
		 * AttackUnit 클래스를 이용해서 객체를 생성하고 
		 * 참조값(id)에 . 찍어서 attack() 메소드 호출하기
		 */
		//static이였다면
		//AttackUnit.attack(); 라고 썼을 것이다.
		// static처럼 클래스명에다 .을 찍은게 아니라 사물함 키 값으로 바뀐 것[new class name()]에다 .을 찍은 것.
		new AttackUnit().attack();
		// 하지만 이 것은 일회용으로 쓴 것이다. 다시 쓰고자 하면 변수에 담는다.
		AttackUnit unit= new AttackUnit();
		
		unit.attack();
		unit.attack();
		unit.attack();
		
		//System.out.println(unit.energy);
		
		// AttackUnit 클래스로 새로운 객체를 생성해서 
		// attack() 메소드를 3번 호출해 보세요
		AttackUnit unit2=new AttackUnit();
		unit2.attack();
		unit2.attack();
		unit2.attack();
	}
}
