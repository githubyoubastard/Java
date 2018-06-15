package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		MyWeapon w1=new MyWeapon();
		w1.prepare();
		w1.attack();
		
		//추상클래스 type으로 받을 수 있다. 
		Weapon w2=new MyWeapon();
		w2.prepare();
		w2.attack();
	}
}
