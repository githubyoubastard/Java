package test.main;

public class MainClass01 {
	
	//메소드의 식별자 main
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		/*
		 *  static 예약어가 붙은 메소드를 호출하는 방법
		 *  클래스명.메소드명();
		 *  
		 *  ex)
		 *  MainClass01.a();
		 */
		MainClass01.a();
		
		/*
		 * 동일한 클래스 안에 존재하는 static 메소드를 호출할 때는 클래스명. 은 생략가능
		 */
		b();
		
		System.out.println("main 메소드가 종료(returen)됩니다.");
	}
	
	// a 라는 메소드를 만들어볼께용
	public static void a() {
		System.out.println("a 메소드가 시작되었습니다.");
		System.out.println("a 메소드가 종료(return)되었습니다.");
	}
	public static void b() {
		System.out.println("b 메소드가 시작되었습니다.");
		System.out.println("b 메소드가 종료(return)되었습니다.");		
	}
}
