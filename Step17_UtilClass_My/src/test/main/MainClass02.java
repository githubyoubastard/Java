package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		//0번방 참조
		int num1=nums.get(0);
		//1번방 참조
		int num2=nums.get(1);
		//2번방 삭제
		nums.remove(2);
		//방크기 참조
		int size=nums.size();
		
		/* 
		 * .add();
		 * .get();
		 * .remove();
		 * .size();
		 */
	}
}
