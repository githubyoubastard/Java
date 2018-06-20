package test.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainClass10 {
	public static void main(String[] args) {
		//필요한 지역변수 미리 만들어 놓기. 왜 여기다 써야하는지 이유를 알아야함. Please refer to MainClass07
		FileReader fr=null;
		BufferedReader br=null;
		try {
			//미리 만든 지역변수에 참조값 대입;
			fr=new FileReader("c:/myFolder/gura.txt");
			br=new BufferedReader(fr);
			StringBuilder builder=new StringBuilder(); 
			while(true) {
				//반복문을 돌면서 한줄씩 읽어들이기 <개행기호는 빠져잇음 만약 개행기호를 넣고 싶으면?>
				String line=br.readLine(); 
				if(line==null) { //다 읽어서 자바가 null을 던지면
					break; //반복문 탈출
				}
				//읽은 문자열을 누적시키기
				builder.append(line);
				builder.append("\r\n"); //<개행기호는 빠져잇음 만약 개행기호를 넣고 싶으면? 이렇게 넣는다.>
			}
			//누적된 내용을 출력하기
			System.out.println(builder.toString());
			
		}catch(IOException ie) {
			ie.printStackTrace();
		}finally {
			try {
				if(fr!=null)fr.close();
				if(br!=null)br.close();
			} catch(IOException ie) {
				ie.printStackTrace();
			}
		}
	}
}
