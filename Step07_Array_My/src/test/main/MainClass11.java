package test.main;

public class MainClass11 {
	public static void main(String[] args) {
		//1. String type을 담을 수 있는 방 5개 짜리 배열 객체를 생성
			String[] names=new String[5];
		//2. 배열에 5개 방에 각각 다른 문자열 저장하기
			names[0]="유재민";
			names[1]="백경원";
			names[2]="유인열";
			names[3]="유수열";
			names[4]="유영수";
		//3. 반복문 for를 이용해서 5개의 방에 있는 문자열을 순서대로 콘솔창에 출력하기;
			for(int i=0;i<names.length;i++) {
				String tmp=names[i];
				System.out.println("tmp:"+tmp);
			}
	}
}
