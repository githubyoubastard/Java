package test.main;

import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {
		//키보드로 부터 문자열을 입력받을 객체
		Scanner scan=new Scanner(System.in);
		//입력한 모든 문자열의 내용을 가지고 있는 String 객체
		String msg="";
		
		while(true) {
			System.out.println("한줄입력(종료:q):");
			//문자열을 한줄 입력 받아서
			String str=scan.nextLine();
			if(str.equals("q")) { //q를 입력하면 반복문 탈출
				break;
			}
			//연결 연산자로 이어 붙인다. //이게 상당히 잘못된 방법 MainClass09참조
			msg=msg+str;
		}
		//입력한 내용 출력하기
		System.out.println("msg:"+msg);
	}
}
