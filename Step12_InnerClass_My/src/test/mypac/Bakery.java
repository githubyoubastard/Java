package test.mypac;

public class Bakery {
	//Bread라는 내부 클래스
	public class Bread{
		public void eat() {
			System.out.println("빵을 먹어요");
		}
	}
	//Cake라는 내부 클래스
	public class Cake{
		public void eat() {
			System.out.println("케이크를 먹어요 ");
		}
	}
	// Bread 객체를 리턴해주는 메소드
	public Bread getBread() {
		return new Bread();
	}
	//Cake 객체를 리턴해주는 메소드
	public Cake getCake() {
		return new Cake();
	}
}