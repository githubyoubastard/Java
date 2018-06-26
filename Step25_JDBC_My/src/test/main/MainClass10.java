package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 *  MemberDao 객체를 이용해서 1번회원의 정보를
		 *  얻어와서(리턴받아서) useDto 메소드를 호출해보세요
		 */
		MemberDao dao=MemberDao.getInstance();
		MemberDto dto=dao.getData(1);
		useDto(dto);
	}
	public static void useDto(MemberDto dto) {
		System.out.println(dto.getNum()+"|"+dto.getName()+"|"+dto.getAddr());
	}
}


