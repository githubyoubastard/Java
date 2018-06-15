package test.main;

public class MainClass03 {
	//이너 클래스
	class Gura{
		
	}
	public static void main(String[] args) {
		//메소드 안에 클래스를 정의할 수 도 있다.
		//이것은 로컬 이너클래스
		class Car{
			//메소드
			public void drive() {
				System.out.println("달려요");
			}
		}
		Car car=new Car();
		car.drive();
	}
}
