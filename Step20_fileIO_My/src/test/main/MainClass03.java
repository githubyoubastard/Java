package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  텍스트 파일에 문자열 출력하는 예제
 */


public class MainClass03 {
	public static void main(String[] args) {
		File file1=new File("c:/myFolder/gura.txt");
		try {
			FileWriter fw=new FileWriter(file1);
			fw.write("야 앞으로 메모는 이렇게 해라. 짜증나게 하지말고\r\n");
			fw.write("야 앞으로 메모는 이렇게 해라. 짜증나게 하지말고\r\n");
			fw.write("야 앞으로 메모는 이렇게 해라. 짜증나게 하지말고");
			fw.flush();
			fw.close(); // 모두 기록했으면 닫아줘야한다.
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일에 문자열이 기록되었습니다.");
	}
}
