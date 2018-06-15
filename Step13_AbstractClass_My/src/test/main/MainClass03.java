package test.main;

import test.mypac.Weapon;

public class MainClass03 {
	public static void main(String[] args) {
		// 익명의 로컬 이너클래스를 이용해서 수열씨를 공격하고 싶다면?
		Weapon w1=new Weapon() {
			@Override
			public void attack() {
				System.out.println("수열씨를 공격해요");				
			}
		};
		//이거
		useWeapon(w1);
		//아니면 이거
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("누굴 공격할까요");
			}
		});
	}
	
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
