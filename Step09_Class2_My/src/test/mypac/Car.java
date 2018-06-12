package test.mypac;

public class Car {
	//필드 정리
	public String name;
	
	
	/*
	 생성자는 정의 되지 않아도 있다고 간주되어짐. (쓰면 명시적으로 쓰는 것, 없으면 있다고 간주됨)
	
	 그래도 눈에 보이게 한번 만들어봄 아래가 바로 생성자. 매소드와 정의하는 방식이 비슷하긴함..
	 생성자는 그럼 언제 만들어지냐..?
	 생성자는 사전작업이라 생각하면 됨. 
	 생성자의 특징은 
	    1. 매소드에서 사용되는 리턴 타입이 없고 
	    2. 클래스와 동일하게 정의됨. 
	    3. 모양만 다르다는 전제 하에 필요에 따라 여러 개 정의가 가능하다. 
	    	단 전달받는 인자의 유무에 따라...오류가 발생 할 수 도 있다.
	 */
	public Car() {
		System.out.println("Car() 생성자 호출됨");
	}
	
	// 인자로 String type을 전달받는 생성자
	public Car(String name) {
		//생성자의 인자로 전달되는 값을 필드에 저장하기.
		this.name=name;
		System.out.println("Car(String name) 생성자 호출됨");
	}
	// 인자로 int type 전달받는 생성자
	public Car(int num) {
		System.out.println("Car(int num) 생성자 호출됨");
	}
	
	
	//매소드 
	public void drive() {
		System.out.println(this.name+"가 주행 중입니다!");
	}
	
}
