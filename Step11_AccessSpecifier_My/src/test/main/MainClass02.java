package test.main;

import test.myspac.MemberDto;

public class MainClass02 {
	public static void main(String[] args) {
		MemberDto mem1=new MemberDto();
		mem1.setNum(1);
		mem1.setName("유수열");
		mem1.setAddr("상계1동");
		mem1.setId(881209);
		int num=mem1.getNum();
		String name=mem1.getName();
		String addr=mem1.getAddr();
		int id=mem1.getId();
		
	}
}
