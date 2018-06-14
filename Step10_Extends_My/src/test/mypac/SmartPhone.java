package test.mypac;

public class SmartPhone extends HandPhone {
	public void doInternet() {
		System.out.println("인터넷을 해요");		
	}
	// ctrl+space 하고 takePicture을 선택해서 부모의 정의를 다시 재정의 할 수 있다.
	@Override
	public void mobileCall() {
		System.out.println("전화 뿐만 아니라 인터넷 전화를 사용할 수 있어요!");
	}
	@Override
	public void takePicture() {
		System.out.println("1억만 화소의 사진을 찍어요 ");
	}
}
