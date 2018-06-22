package example4;

import java.io.BufferedWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		BufferedWriter br=null;
		Socket socket=null;
		try {
			socket=new Socket("",5000);
			System.out.println("접속 성공");
			while(true) {
				String msg=scan.nextLine();
				System.out.println("입력할 문자(종료:q):");
								
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
}






