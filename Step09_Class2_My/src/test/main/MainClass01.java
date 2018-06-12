package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		//1. test1() 메소드 호출
			MainClass01.test1();
		//2. test2() 메소드 호출
			new MainClass01().test2();
	}
	//MainClass01의 static 멤버 메소드
	public static void test1() {
		System.out.println("test1() 호출됨");
	}
	//MainClass01의 non-static 멤버 메소드
	public void test2() {
		System.out.println("test2() 호출됨");
	}
}
