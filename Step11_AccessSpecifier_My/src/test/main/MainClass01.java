package test.main;

import test.myspac.Radio;
//import 가 가능한 이유는(public class Radio)
public class MainClass01 {
	public static void main(String[] args) {
		// 생성자 호출가능 ( public Radio(){} )
		Radio r=new Radio();
		// 메소드 호출 가능 ( public void channelUp(){} )
		r.channelUp();
		// 필드 접근 가능  ( public int volum )
		int result=r.volumn;
	}
}
