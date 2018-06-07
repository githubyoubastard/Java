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
		
		System.out.println("main 메소드가 종료(returen)됩니다.");
	}
	
	// a 라는 메소드를 만들어볼께용
	public static void a() {
		System.out.println("a 메소드가 시작되었습니다.");
		System.out.println("a 메소드가 종료(return)되었습니다.");
	}
}
