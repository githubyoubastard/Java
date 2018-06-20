package test.main;

import java.io.FileReader;
import java.io.IOException;

public class MainClass06 {
	public static void main(String[] args) {
		try {
			//file 에서 문자열을 읽어들일 FileReader 객체 생성
			FileReader fr=new FileReader("c:/myFolder/gura.txt");
			//한번에 5글자 담을 수 있는 char[] 객체 생성
			char[] buffer=new char[5];
			// 텍스트가 몇줄일지 모르니 무한루프 while로 함. 근데 읽어들일 글자가 5글자인데 
			// 22개라고하면?
			// 5 5 5 5 2만 함. 더 읽어드릴게 없으면 -1을 자바가 던져버림
			// 우린 이 -1이라는 것으로 while구문 탈출구를 짜야함.
			while(true) {
				fr.read(buffer);
				int readedCount=fr.read(buffer);
				if(readedCount==-1) {
					break;
				}
				//while 반복문 안에 반복문으로 배열에 있는 모든 내용을 출력하기
				for(int i=0;i<readedCount;i++) {
					char tmp=buffer[i];
					System.out.println(tmp);
				}		
			}
			//마무리 작업
				fr.close();
		}catch(IOException ie){
			ie.getStackTrace();
		}
	}
}
