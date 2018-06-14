package test.myspac;
/*
 *  회원 한명의 정보를 담을 수 있는 개체를 생성하기 위한 
 *  클래스정의하기
 *  
 *  dto => Data Transfer Object 의 약자
 *  
 *  dto 클래스 작성방법
 *  1. 필드의 접근 지정자를 private로 지정해서 만든다.
 *  2. default 생성자와 인자로 필드값을 전달 받는 생성자를 만든다.
 *  3. 모든 필드에서 setter/getter 메소드를 정의한다.
 * 
 */
public class MemberDto {
//필드
	private int num;
	private String name;
	private String addr;
	private int id;
//생성자 2개 만듬
	public MemberDto() {}
	public MemberDto(int num, String name, String addr, int id) {
	super();
	this.num = num;
	this.name = name;
	this.addr = addr;
	this.id = id;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
	
}
