package test.main;

import java.io.IOException;
import java.io.OutputStream;

public class MainClass04 {
	public static void main(String[] args) {
		// printScreen 객체의 참조값 부모값을 부모 type outputStream 타입으로
		// 받아서 테스트하기.
		OutputStream os=System.out;
		try {
			//출력할 준비
			os.write(97);
			os.write(98);
			os.write(99);
			os.write(100);
			os.write(101);
			
			//출력 준비가 된 문자열 출력하기
			os.flush();
			
			// 방 5개 짜리 Byte[] 객채를 생성해보세요
			byte[] nums=new byte[5];
			nums[0]=102;
			nums[1]=103;
			nums[2]=104;
			nums[3]=105;
			nums[4]=106;
			
			// .write() 메소드 호출하면서 byte[] 객체 전달
			os.write(nums); // auto flush 기능이 있음
			System.out.println();
			
			// .write(byte[] , 시작인덱스, 갯수){}
			os.write(nums, 0, 3);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/* 
		 *  public class OutputStream{
		 *  	public void write(in b){
		 *  	}
		 *  	public void write(byte[] b){
		 *  	}
		 *  	public void(byte[] b, int off, int len){
		 *  	}
		 *  }
		 */
	}
}
