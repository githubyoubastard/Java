package example2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("전송할 메세지 입력:");
		String msg=scan.nextLine();
		
		// 필요한 객체를 담을 변수 만들기
		Socket socket=null;
		BufferedWriter bw=null;
			try {
				// new Socket(서버의 ip, port 번호)
				socket=new Socket("192.168.0.73",5000); //접속 요청
				System.out.println("socket 연결 성공!");
				bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				bw.write(msg); //문자열 출력
				bw.newLine(); //개행기호 출력
				bw.flush(); // 전송
				System.out.println("서버에 문자열 전송완료");
			}catch(Exception e) {
				e.printStackTrace();
			}finally{
				try {
					if(socket!=null)socket.close();
					if(bw!=null)bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
	}
}
