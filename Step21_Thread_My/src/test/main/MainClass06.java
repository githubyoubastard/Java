package test.main;

import test.mypac.MyRunnable;
// MainClass05와 관련
public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작됨");
		//한줄의 코드로 간단히 시작시키려면.......(대신에 쓰고 저장되는게 아니라 한번 쓰고 버리는거임)
		new Thread(new MyRunnable()).start();

		System.out.println("main 스레드가 종료됩니다.");
	}
}
