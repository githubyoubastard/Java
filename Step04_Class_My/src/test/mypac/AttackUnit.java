package test.mypac;

public class AttackUnit {
	//non-static 맴버 필드
	public int energy=100;

	//non static 맴버 메소드
	public void attack() {
		System.out.println("공격해요!");
	}
	public void defense() {
		System.out.println("방어해요!");
	}
	public void move() {
		System.out.println("움직여요!");
	}
}
