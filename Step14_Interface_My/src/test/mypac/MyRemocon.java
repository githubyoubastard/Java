package test.mypac;

/*
 *  Remocon 인터페이스를 implements 한 클래스 정의하기
 *   - 인터페이스에 정의된 모든 추상 메소드를 오버라이드 해야한다.
 *   - 세가지 타입으로 MyRemocon이 될 수 있는데
 *   - 1. MyRemocon
 *   - 2. Remocon
 *   - 3. Objects
 *   
 *   && MyRemocon은 어디까지나 Remocon을 사용하기 위한 도구일 뿐
 *  
 */
								//여기는 아무것도 안적혀 있어도
public class MyRemocon  implements Remocon{
								// extends Object가 생략 되었다고 생각하면 된다. 
	@Override
	public void up() {
		System.out.println("볼륨을 올린다.");
	}

	@Override
	public void down() {
		System.out.println("볼륨을 낮춘다.");
	}

}
