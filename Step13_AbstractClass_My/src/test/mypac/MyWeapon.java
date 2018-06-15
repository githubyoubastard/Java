package test.mypac;

public class MyWeapon extends Weapon {
	
	//추상클래스를 상속받는 것 자체만으로도 오류가 뜸
	//MyWeapon에 마우스를 갖다대면 옵션중에 override기능이 있음
	//상속받은 자식 MyWeapon에서 attack을 재정의해야함.
	@Override
	public void attack() {
		System.out.println("open fire to all targets");
	}

}
