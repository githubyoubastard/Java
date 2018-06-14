package test.main;

import test.myspac.MemberDao;

public class MainClass05 {
	public static void main(String[] args) {
		MemberDao dao1=MemberDao.getInstance();
		MemberDao dao2=MemberDao.getInstance();
		MemberDao dao3=MemberDao.getInstance();
		MemberDao dao4=MemberDao.getInstance();
		MemberDao dao5=MemberDao.getInstance();
	}
}
