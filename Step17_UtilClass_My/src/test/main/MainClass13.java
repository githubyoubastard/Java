package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;
import test.mypac.MemberDto;
import test.mypac.Person;

public class MainClass13 {
	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<>();
		ArrayList<Integer> b=new ArrayList<>();
		ArrayList<Double> c=new ArrayList<>();
		ArrayList<String> d=new ArrayList<>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		int num=(int)a.get(0);
		
		/*
		 *  String type을 담을 수 있는 ArrayList 객체를 생성해서
		 *  문자열을 3개 저장해보세요
		 */
		ArrayList<String> members=new ArrayList<>();
		members.add("유수열");
		members.add("백경원");
		members.add("유재민");
		
		// Person Type을 담을 수 있는 ArrayList 객체를 생성해서 
		ArrayList<Person> persons=new ArrayList<>();
		// Person 객체를 3개 저장해 보세요
		persons.add(new Person());
		
		
		//Car 객체를 저장할 수 있는 ArrayList 객체 생성해서
		//Car 객체 3개 담아보세요
		//반복문을 돌명서 배열에 있는 Car객체를 하나씩 참조해서 
		// .drive() 메소드 호출하기
		
		ArrayList<Car> cars=new ArrayList<>();
		cars.add(new Car());
		cars.add(new Car());
		cars.add(new Car());
		for(int i=0;i<cars.size();i++) {
			Car tmp=cars.get(i);
			tmp.drive();
		}
		
		List<Car> list=new ArrayList<>();
		list.add(new Car());
		list.add(new Car());
		list.add(new Car());
		
		Object room1=list.get(0);
		Car room2=(Car)list.get(1);
		
		/*
		 * 	1. MemberDto type 을 담을 ArrayList 객체를 생성하고
		 * 	
		 * 2. 3명의 회원 정보를 각각 MemberDto 객체에 담아서
		 *  
		 * 3. MemberDto 객체의 참조값을 ArrayList객체 에 저장하기. 
		 *  
		 */
		
		List<MemberDto> member=new ArrayList<>();
		MemberDto d1=new MemberDto();
		d1.setNum(1);
		d1.setName("유수열");
		d1.setAddr("노원구");
		MemberDto d2=new MemberDto(2,"유인열","노원구");
		MemberDto d3=new MemberDto(3,"유재민","노원구");
		
		member.add(d1);
		member.add(d2);
		member.add(d3);
		
		for(int i=0;i<member.size();i++) {
			MemberDto tmp=member.get(i);
			System.out.println(tmp.getNum()+tmp.getName()+tmp.getAddr());
		}
		for(MemberDto tmp:member) {
			System.out.println(tmp.getNum()+tmp.getName()+tmp.getAddr());
		}
	}
}
