package test.dto;

public class EmpDto {
	private String ename;
	private String dname;
	public EmpDto() {};
	public EmpDto(String ename, String dname) {
		super();
		this.ename = ename;
		this.dname = dname;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
}
