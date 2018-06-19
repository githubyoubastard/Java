package test.main;


/*
 *  [ inputStreamReader ]
 *  
 *  - 2byte 처리 스트림 (256*256= 65536 가지 데이터 표현가능)
 *  - 한글 처리 가능
 * 
 * 
 * 
 */


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class MainClass02 {
	public static void main(String[] args) {
		// 키보드와 연결된 InputStream 객채의 참조값을 생정자의 인자로
		// 전달하면서 InputStreamReader 객체 생성해서 참조값 변수에 담기.
		InputStream is=System.in;
		InputStreamReader isr=new InputStreamReader(is);
		System.out.println("한글자 입력");
		try {
			int code=isr.read();
			System.out.println("code:"+code);
			char ch=(char)code;
			System.out.println("입력한 글자:"+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
