package test.main;

/*
 *  class 안에 정의 할 수 있는 것.
 *  1. field
 *  2. constructor
 *  3. method
 *  4. static field
 *  5. static method
 *  6. inner class
 *  
 */

public class MainClass01 {
	//필드(new 해서 객채를 생성할 때마다 저장소가 생김)
	public int num=10;
	//static 필드 (오직 하나의 저장소)
	public static int num2=20;
	
	
	//static main 메소드
	public static void main(String[] args) {
		// int result=this.num; => X 이유는?
		//this는 객체 안에 있는 메소드가 참조값(id값)을 참조할 때만 가능
		// static영역 안에 있는 static 자원들은 this를 할 수 없는 이유가 클래스명으로 static 자원들만 참조가 되지,
		// 참조값(ID값)으로 참조 할 수 없기 때문에 this를 할 수 없다.
		int result2=MainClass01.num2;
		new Gura();
	}	// 내부 클래스 정의하기. 메인클래스에서 구라 클래스를 참조하려면 구라 클래스에 static 이라는 예약어가 필수
	public static class Gura{
		
	}
}
