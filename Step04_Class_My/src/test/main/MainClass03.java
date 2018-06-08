package test.main;
import test.mypac.AttackUnit;

public class MainClass03 {
	public static void main(String[] args) {
		new AttackUnit().attack();
		
		//static이였다면
		//AttackUnit.attack(); 라고 썼을 것이다.
	}
}
