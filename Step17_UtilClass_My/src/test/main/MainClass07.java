package test.main;


import java.util.ArrayList;
import java.util.List;
import test.mypac.MemberDto;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * 	1. MemberDto type 을 담을 ArrayList 객체를 생성하고
		 * 	
		 * 2. 3명의 회원 정보를 각각 MemberDto 객체에 담아서
		 *  
		 * 3. MemberDto 객체의 참조값을 ArrayList객체 에 저장하기. 
		 *  
		 */
		
		List<MemberDto> members=new ArrayList<>();
		
		MemberDto dto1=new MemberDto(1,"유수열","행신동");
		MemberDto dto2=new MemberDto();
		dto2.setNum(2);
		dto2.setName("김구라");
		dto2.setAddr("행신동");
		MemberDto dto3=new MemberDto(3,"유인열","행신동");
		
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		
		//참조 연습
		List<MemberDto> a=members;
		MemberDto b=members.get(0);
		int c= members.get(0).getNum();
		String d=members.get(0).getName();
		String e=members.get(0).getAddr();
		
		/*
		 *  <List>.<memberDto>.<int>
		 *  members.get(0).getNum();
		 */
	}
}
