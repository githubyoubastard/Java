package test.main;

import test.mypac.Apple;
import test.mypac.AppleBox;
import test.mypac.Banana;
import test.mypac.BananaBox;
import test.mypac.Orange;
import test.mypac.OrangeBox;

public class MainClass01 {
	public static void main(String[] args) {
		//Apple의 객체를 담으려면?
		AppleBox box1=new AppleBox();
		box1.push(new Apple());
		
		//바바나의 객체를 담으려면
		BananaBox box2=new BananaBox();
		box2.push(new Banana());
		
		//오랜지 객케를 담으려면
		OrangeBox box3=new OrangeBox();
		box3.push(new Orange());
	}
	// 이러면 매우 불편하다.
	// 타입만 다르지 다른 건 다 똑같은데 만약 과일이 30종류라고 치자.
	// 어쩔?
}
