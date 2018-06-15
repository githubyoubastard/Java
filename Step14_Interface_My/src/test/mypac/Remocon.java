package test.mypac;

public interface Remocon {
/*
 *  [ interface ] 
 *  - 생성자가 없다
 *  - 구현된 멤버 메소드는 정의할 수 없다.(추상 메소드만 가질 수 있음, 이 인터페이스에서는 다 추상메소드이기 때문에 
 *	 - 굳이 안붇여도 된다.)
 *  - 멤버 필드는 static final 멤버 필드만 가질 수 있다.
 *  - Data type 역할을 할 수 있다.
 *  - 인터페이스 type의 참조값이 필요하면 인터페이스의 구현 클래스를 만들어서 객체를 생성해야한다.
 * 
 */
	//필드
	public static final int VERSION=1;
	public int VERSION_2=2;
	public static final String COPORATE="LG";
	public String COMPANY="SAMSUNG";
	
	//메소드(추상)
	public abstract void up();
	public void down();
}
