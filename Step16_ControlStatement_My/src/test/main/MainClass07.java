package test.main;

import test.mypac.Car;

/*
 *  비교 연산자
 *   ==, != 에 대한 이해
 *   
 *		비교 연산자는 실제 값을 비교하는 연산자 		
 * 
 */
public class MainClass07 {
	public static void main(String[] args) {
		int num1=10;
		int num2=10;
		int num3=20;
		
		boolean result= num1==num2;
		boolean result2= num2==num3;
		
		Car car1=new Car("소나타");
		Car car2=new Car("소나타");
		Car car3=car1;
		
		//참조 데이터 type을 비교
		boolean result3=car1==car2;
		boolean result4=car1==car3;
		
		//문자열 비교?
		String name1="김구라";
		String name2="김구라";
		String name3="이정호";
		String name4="이정호";
		
		//김구라, 이정호라는 문자열을 new해서 객체를 생성했기 때문에 다른 id값을 가지고 있다.
		String name5=new String("김구라");
		String name6=new String("김구라");
		String name7=new String("이정호");
		
		//문자열의 내용을 비교할 때는 .equals() 메소드를 사용한다.
		Boolean result5=name1.equals(name2); 
		Boolean result6=name1.equals(name4); 
		Boolean reuslt7=name1.equals(name6);
		Boolean reuslt8=name1.equals("김구라");
		Boolean result9=name1.equals("이정호");
		Boolean reault10="김구라".equals(name1);
	}
}
