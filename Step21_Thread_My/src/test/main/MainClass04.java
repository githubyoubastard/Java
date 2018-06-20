package test.main;

import test.mypac.Player;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작됨");
		Player p1=new Player("김구라");
		p1.start();
		Player p2=new Player("해골");
		p2.start();		
	}
}
