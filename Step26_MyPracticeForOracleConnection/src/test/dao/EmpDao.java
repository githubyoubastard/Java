package test.dao;

public class EmpDao {
	private EmpDao dao;
	private EmpDao() {};
	public EmpDao getInstance() {
		if(dao==null) {
			dao=new EmpDao();
		}
		return dao;
	}
}
