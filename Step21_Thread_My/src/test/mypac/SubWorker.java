package test.mypac;
/*
 *  [ 스레드 만들기 ]
 *  
 *  <방법>
 *  
 *  1. thread 클래스를 상속 받은 클래스를 정의한다.
 *  2. run() 메소드를 오버라이딩 한다.
 *  3. 새로운 작업단위가 필요한 시점에서 지금 정의한 클래스를 
 *  	이용해서 객체를 생성하고 start() 메소드를 호출하면 
 *  	run() 메소드에서 새로운 스레드가 시작된다.
 * 
 */

public class SubWorker extends Thread{
	@Override
	public void run() {
		System.out.println("서브 스레드 시작");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("소브 스레드 종료");
	}
}
