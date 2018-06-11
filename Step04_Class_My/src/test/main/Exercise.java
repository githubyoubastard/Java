package test.main;

import java.util.Random;

import test.mypac.AttackUnit;

public class Exercise {
	public static void main(String[] args) {
		AttackUnit unit1=new AttackUnit();
		unit1.attack();
		int a=unit1.energy;
		Random ran=new Random(unit1.energy);
		System.out.println(ran);
	}
}
