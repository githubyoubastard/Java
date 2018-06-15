package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		// 콘솔창으로 부터 입력 받을 수 있는 Scanner 객체 생성
		Scanner scan=new Scanner(System.in);
		System.out.println("점수 입력:");
		//Scanner 객체를 이용해서 정수 입력 받기(점수)
		int jumsu=scan.nextInt();
		if(jumsu>=90) {
			System.out.println("A입니다");
		}else if(jumsu>=80) {
			System.out.println("B입니다.");
		}else if(jumsu>=70) {
			System.out.println("C입니다.");
		}else if(jumsu>=60) {
			System.out.println("D입니다.");
		}else if(jumsu>=50) {
			System.out.println("F입니다.");
		}
	}
}
