package test.main;
/*
 * 기본(primitive) data type vs 참조(reference) data type
 * 
 * 기본 data type 변수에는 실제로 값이 들어가 있고
 * 참조 data type 변수에는 id값(참조값)이 들어있다.
 */

public class MainClass05 {
	public static void main(String[] args) {
		//기본 data type 변수에 값 대입하기
		System.out.println("main 메소드가 시작되었습니다.");
		int num1=10;
		double num2=10.1;
		boolean isRun=true;
		char ch1='A';
		
		// 참조 data type 변수에 값 대입하기
		String myName="김구라";
	}
}
