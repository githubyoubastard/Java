package test.main;
/*
 *  [ Thread ] 
 *   - main() 메소드에서 시작되는 작업단위 : 메인 스레드
 *   - 실행의 흐름이라고도 합니다.
 *   - 필요하다면 여러개의 작업 단위를 만들수 있습니다.
 *   
 *   
 *   main Thread
 *          |				<sub Thread>
 *          |ㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *          |						| 			  <sub Thread2>	
 *          |ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *          |						|						|
 *          |						|						|
 *          
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 쓰레드가 시작됨");
		try {
			//메인쓰레드를 5초동안 지연시키기.
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		test();
		try {
			//메인쓰레드를 5초동안 지연시키기.
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 쓰레드가 종료됨");
	}
	public static void test() {
		System.out.println("test() 메소드에 실행 순서가 왔습니다.");
	}
}
