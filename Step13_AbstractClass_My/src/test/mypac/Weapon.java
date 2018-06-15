package test.mypac;
/*
 *  [ 추상 클래스 (Abstract Class) ]
 *  
 *  - class 예약어 앞에 abstract를 명시해서 클래스를 정의한다.
 *  - 형태만 정의되고 실제 구현은 되지 않은 메소드가 존재 할 수 있다.
 *  - 형태만 정의된 메소드를 만들 때는 abstract 예약어를 붙여서 정의한다.
 *  - 생성자는 존재하지만 단독으로 객체 생성은 불가하다. 
 *  - 다만 생성된 객체의 변수에 설명서 역할하는 타입 역할은 할 수 있다.
 *  - 추상클래스 type 의 id 가 필요하다면 추상클래스를 상속받은 자식클래스를 정의해서 객체 생성한다.
 *  - 추상클래스를 상속받은 자식클래스는 부모의 추상메소드를 모두 오버라이드(재정의,ctrl+space) 해야한다.
 * 
 */


//추상 클래스
public abstract class Weapon {
	//일반 메소드
	public void prepare() {
		System.out.println("Initialize firearms system");
	}
	//추상 메소드 
	public abstract void attack();
}
