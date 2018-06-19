package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("c:/myFolder/monkey.txt", true); //true를 넣어주면 append 기능이 추가됨 FileWriter. 해보면 여러가지 기능이 있다.
			fw.write("원숭아 \r\n");
			fw.write("당구 한 게임 콜? \r\n");
			fw.flush();
			fw.close();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		System.out.println("monkey.txt을 만들면서 문자열을 기록했당");
	}
}
