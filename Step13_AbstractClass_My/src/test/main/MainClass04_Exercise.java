package test.main;

import test.mypac.SecretWeapon;
import test.mypac.Weapon;

public class MainClass04_Exercise {
	public static void main(String[] args) {
		SecretWeapon s=new SecretWeapon();
		s.attack();
		useWeapon(s);
		
	}	
	public static void useWeapon(Weapon w) {
		w.prepare();
	}
}
