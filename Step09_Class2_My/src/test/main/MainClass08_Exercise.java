package test.main;

import test.mypac.Member;

public class MainClass08_Exercise {
	public static void main(String[] args) {
		Member mems=new Member();
		mems.num=1;
		mems.name="유수열";
		mems.addr="상계1동";
		
		new Member(1,"유수열","상계1동");
	}
}
