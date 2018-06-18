package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass11 {
	public static void main(String[] args) {
		// Map<String, Object> 를 저장할 ArrayList 객체를 생성
		// 해서 참조값을 members 라는 변수에 담아 보세요.
		List<Map<String, Object>> members=new ArrayList<>(); 
		
		// 회원3명의 정보를 담아 보세요.
		Map<String, Object> map1=new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("addr", "노량진");
		
		Map<String, Object> map2=new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "해골");
		map2.put("addr", "원숭이");
		
		Map<String, Object> map3=new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "원숭이");
		map3.put("addr", "상도동");
		
		//ArrayList 객체에 담기
		members.add(map1);
		members.add(map2);
		members.add(map3);
		
		//for 문을 이용해서 members에 있는 회원 정보를 
		//콘솔창에 출력해보세요
		// [출력형식]
		// 번호: 1 이름: 김구라 주소:노량진
		// 번호: 1 이름: 김구라 주소:노량진
		// 번호: 1 이름: 김구라 주소:노량진
		
		for (int i=0;i<members.size();i++) {
				Map<String,Object> tmp=members.get(i);
					System.out.println("번호:"+tmp.get("num")+
										   "   이름:"+tmp.get("name")+
										   "   주소:"+tmp.get("addr"));
		}
		for (Map<String,Object> tmp:members) {
			System.out.println("번호:"+tmp.get("num")+
					   "   이름:"+tmp.get("name")+
					   "   주소:"+tmp.get("addr"));			
		}
	}
}










