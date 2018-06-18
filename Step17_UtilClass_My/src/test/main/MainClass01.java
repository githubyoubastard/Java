package test.main;

import java.util.ArrayList;

/*
 *  [ Array List ] 
 *  
 *  -가변 배열이다. ( 고정 배열이 아님.)
 *  -기본 data type은 저장할 수 없고 참조값 만 저장 할 수 있다.
 *  -Data type을 저장하려면 참조값으로 사용할 수 있는 기본 data type으로 바꿔서 사용해야함!
 *  -Generic 클래스를 지정하지 않으면 object가 Generic 클래스로 지정된다.
 */

public class MainClass01 {
	public static void main(String[] args) {
		//Object type을 저장할 수 있는 가변 배열
		ArrayList list1=new ArrayList<>();
		//Object type을 저장할 수 있는 가변 배열
		ArrayList<Object> list2=new ArrayList<Object>();
		//정수를 저장할 수 있는 가변 배열
		ArrayList<Integer>list3=new ArrayList<>();
		//실수를 저장할 수 있는 가변 배열
		ArrayList<Double> list4=new ArrayList<>();
		//문자열을 저장할 수 있는 가변 배열
		ArrayList<String> list5=new ArrayList<>();
		
		boolean a=list5.add("김구라");
		boolean b=list5.add("유수열");
		boolean c=list5.add("유인열");
		
		String num=list5.get(1);
		
	}
}
