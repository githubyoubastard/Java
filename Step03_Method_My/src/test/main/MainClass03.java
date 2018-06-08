package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		MainClass03.printMsg();
		MainClass03.printMsg2("안녕");
		printMsg2("유수열 입니다.");
//		printMsg2(999); 자바 문법은 엄격하기 때문에 String 타입을 선언하면 반드시 String으로 와야한다
//		printMsg2(999)를 오게 하려면 선언할 때, public static void printMsg2(int msg)
//		printMsg2(1.213)를 오게 하려면 선언할 때, public static void printMsg2(float msg)		
		printMsg2("999");
	}
	public static void printMsg() {
		System.out.println("메세지를 출력합니다.");
	}
							        //괄호안에다가 지역변수(local variable)를 선언할 수 있다.
									//값을 받기 위한 행위 
	public static void printMsg2(String msg) {
		System.out.println("msg:"+msg);
	}
}
