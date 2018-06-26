package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 *  memberDao 객체를 이용해서 
		 *  2번 회원 정보를 다음과 같이 수정해보세요.
		 * 
		 *  이름: 이주호
		 *  주소: 상도동
		 */
		int num=2;
		String name="이주호";
		String addr="상도동";
		
		//MemberDao 객체의 참조값 얻어와서 변수에 담기
		MemberDao dao=MemberDao.getInstance();
	
		//회원정보를 변수에 담기
//		dao.update(new MemberDto(num,name,addr));
		
		// default 생성자를 호출해서 객체 생성후
		MemberDto dto=new MemberDto();
		// setter 메소드를 이용해서 회원정보를 전달하고
		dto.setNum(2);
		dto.setName("이주환");
		dto.setAddr("상도동");
		//MemberDao 객체를 이용해서 DB에 수정반영한다.
		dao.update(dto);
		dao.delete(1);
		dao.delete(2);
		System.out.println("삭제완료");
	}
}
