package test.mypac;

public class MyGun extends Gun{
	
	
	//자식 생성자에서 부모 생성자에 필요한 값을 전달받아서
	//부모 생성자에 넘겨줘야 한다.
	public MyGun(Bullet bullet) {
		super(bullet); //super();는 부모생성자를 의미한다.	
	}
	@Override
	public void fire() {
//		super.fire();
		System.out.println("내 마음대로 빵빵");
	}
	
}
