package test.main;

import test.myspac.MemberDto;

public class MainClass03 {
	public static void main(String[] args) {
		MemberDto mem1=new MemberDto();
		mem1.setNum(1);
		mem1.setName("유수열");
		mem1.setAddr("상계1동");
		mem1.setId(881209);
		
		//2번 회원정보를 MemberDto 객체를 생성할 때 저장
		MemberDto mem2=new MemberDto(2,"유인열","상계1동",870329);		
	}
}
