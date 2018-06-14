package test.mypac;

/*
 *  [ 상속(extends) ]
 *   - 클래스를 정의하면서 특정 클래스를 상속 받으려면
 *     extends 예약어를 이용해서 상속 받을 수 있다.
 *     
 *     extends + 상속 받을 클래스명
 *     
 */


// Phone이라는 부모 클래스를 상속 받으면서 추가적으로 스스로 메소드를 또 추가함
public class HandPhone extends Phone {
	public void mobileCall() {
		System.out.println("이동하면서 전화해요~");
	}
	public void takePicture() {
		System.out.println("30만 화소의 사진을 찍어요!");
	}
}
