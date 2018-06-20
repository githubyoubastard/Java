package test.main;

import test.mypac.SubWorker;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인 스레드가 시작됨");
		//새로운 자업단위 시작 시키기.
		SubWorker s=new SubWorker();
		s.start();
		System.out.println("메인 스레드가 종료됨");
	}
}
