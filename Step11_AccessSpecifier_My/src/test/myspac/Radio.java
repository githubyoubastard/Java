package test.myspac;
/*
 *  [ 접근 지정자 (Access Specifier) ]
 *  
 *  종류: public, protected, default(작성안한경우), private
 *  
 *  public => 어디서든 접근 가능
 *  protected => 같은 package 또는 다른 패키지라도 상속관계의 자식이면 okay
 *  default => 같은 Package 내에서만 접근 가능
 *  private => 같은 Class 내에서만 접근 가능
 *  
 *  접근 지정자를 작성할 수 있는 위치:
 *  1. 클래스	= 클래스에 붙일 수 있는 건 public or default만 가능
 *  2. 생성자	
 *  3. 필드		= 최소한 부분만 공개하고 왠만하면 필드는 private 으로 한다. 
 *  4. 메소드	
 */
public class Radio {
//필드
	public int volumn;
//생성자
	public Radio() {
		
	}
//메소드
	public void channelUp() {
		
	}
	
}
