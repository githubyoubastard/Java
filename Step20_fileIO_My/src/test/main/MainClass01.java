package test.main;

import java.io.File;
import java.io.IOException;

/*
 *  C:\ 경로에 myFolder 라는 이름의 폴더를 만드는 예제
 *  
 *  	- 확인해서 myFolder 가 없으면 만들고 있으면 안만들기
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		String path="c:/myFolder";
		File f=new File(path);
		if(f.exists()) {
			System.out.println(path+"는 이미 존재 합니다.");
			if(f.isDirectory()) {
				System.out.println(path+"는 디렉토리입니다.");
			}
		}else {
			f.mkdir();
			System.out.println(path+"의 파일을 생성합니다.");
		}
		
	}
}
