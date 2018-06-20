package test.main;

import java.util.Scanner;

public class MainClass09 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		StringBuilder builder=new StringBuilder();
		
		String msg="";
		
		while(true) {
			System.out.println("한줄입력(종료:q):");
			String str=scan.nextLine();
			if(str.equals("q")) {
				break;
			}
			//StringBuilder 객체에 누적시키기
			//왜 이렇게 하냐!? 이유는 msg=msg+str (연결연산자)을 하게 되면 한번만 쓰고 버리는 쓰레기 데이터들이 넘쳐나기 때문에 나중에
			//어플리케이션 속도에 영향을 미치기 때문이다.
			builder.append(str);
		}
		//누적된 문자열 한번에 얻어낼때 toString을 사용한다.
		String result=builder.toString();
		
		System.out.println("msg:"+result);
	}
}
