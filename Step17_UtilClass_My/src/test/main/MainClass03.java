package test.main;

import java.util.ArrayList;

import test.mypac.Person;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *  String type을 담을 수 있는 ArrayList 객체를 생성해서
		 *  문자열을 3개 저장해보세요
		 */
		ArrayList<String> names=new ArrayList<>();
		names.add("유수열");
		names.add("유인열");
		names.add("유재민");
		
		String name1=names.get(0);
		String name2=names.get(1);
		String name3=names.get(2);
		
		// Person Type을 담을 수 있는 ArrayList 객체를 생성해서 
		ArrayList<Person> persons=new ArrayList<>();
		// Person 객체를 3개 저장해 보세요
		persons.add(new Person());
		Person p=new Person();
		persons.add(p);
		boolean c=persons.add(new Person());
		
		
	}
}
