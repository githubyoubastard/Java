package test.main;

import java.util.HashMap;
import java.util.Map;

/*
 *  JaveScript 			|			Java
 *   var obj={};		|		Car c=new Car();
 *   						|	Person p=new Person();
 *   						|	Map<String,Object> m=new HashMap<>();
 *   
 *    [ HashMap ]
 *    
 *    - key : value 형태로 데이터를 관리하고자 할 때 사용한다.
 *    - Generic 클래스는 2개를 지정해야한다.
 *    - Key Generic , Value Generic
 *    - 데이터 저장 : .put(key, value)
 *    - 데이터 참조 : .get(key)
 *    - key 존재여부 확인 : .containsKey(key)
 *    - 데이터 모두 삭제: clear()
 *    - 특정 데이터 삭제: remove(key)
 */

public class MainClass09 {
	public static void main(String[] args) {
		// 회원 한명의 정보를 HashMap 객체에 담기
		// index으로 데이터를 관리하는게 아니라 키 값으로 관리함.
		//    data key값(대부분 String), value 타입은 object으로 모든 primitive 데이터 타입을 정의 가능
		// 여러 개 타입을 key값으로 관리하고 싶으면 HashMap을 사용
		// 한 가지 타입을 id값으로 관리하고 싶으면 list/Arraylist<>;
//		HashMap<String, Object> map=new HashMap<>();
		Map<String, Object> map=new HashMap<>();
		//Arraylist에서 list로 데이터 타입을 받드시
		//Hashmap을 데이터 타입으로 map으로 지정할 수 있다.
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("addr", "노량진");
		
		//HashMap 객체에 있는 데이터 참조
		//Object로 value를 주기 때문에 데이터 타입을 기억하고 casting 해줘야함.
		int num=(int)map.get("num");
		String name=(String)map.get("name");
		String addr=(String)map.get("addr");
		boolean isMan=(boolean)map.get("isMan");
		}
	
//		//삭제
//		map.remove("addr");
//		// key 존재 여부
//		boolean result=map.containsKey("num");
}
