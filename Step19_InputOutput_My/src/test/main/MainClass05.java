package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainClass05 {
	public static void main(String[] args) {
		OutputStream os=System.out;
		//생성자의 인자로 OutputStream 객체를 전달해서
		//OutputStream writer 객체 생성하기.
		OutputStreamWriter osw=new OutputStreamWriter(os);
		
		try {
			osw.write("abcd 1234 한글도 출력되네?");
			osw.flush();
			
			char[] b=new char[5];
			b[0]='A';
			b[1]='B';
			b[2]='C';
			b[3]='D';
			b[4]='E';
			osw.write(b);
			osw.flush();
			
			System.out.println(""); //개행
			
			osw.write(b, 0, 3);
			osw.flush();
			
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
