package test.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) {
		// try 안에 만들어진 fr, br 지역변수는 try 블럭 안에서만 사용 가능. 그러므로 finally에 br,fr을 사용할 수 가 없다.
		// 고로 try밖에다가 변수를 지정한다.
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			//file 에서 문자열을 읽어들일 FileReader 객체 생성
			fr=new FileReader("c:/myFolder/gura.txt");
			br=new BufferedReader(fr);
			//bufferedreader 객체를 이용해서 한 줄 읽어들이기
			while(true) {
				String line=br.readLine();
				System.out.println(line);
				if(line==null) { //자바는 더이상 읽을게 없으면 String 타입 null을 line에게 던진다. 
 					break; //반복문 탈출
				}	
			}

		}catch(IOException ie){
			ie.getStackTrace();
		}finally { //예외가 발생하던 안하던 반드시 실행이 보장 되는 영역
			//마무리 작업 <좀 더 견고한 코드.> 
			try {
				if(fr!=null) {//<실행할 게 한 개라고 하면>
					fr.close();  //
				}
				if(fr!=null)br.close(); //이렇게도 사용가능
			} catch (IOException ie) {}	
		}
	}
}
