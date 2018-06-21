package example3;

/*	[용어]
 *  overwrite: 재정의
 *  overload: 다중 
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
			try {
				serverSocket=new ServerSocket(5000);
				while(true) {
					Socket socket=serverSocket.accept();
					System.out.println("클라이언트가 접속함!");
					//생성자의 인자로 socket 객체의 참조값 전달해서 
					//쓰레드 객체를 생성후
					Thread t=new ServerThread(socket);
					//쓰레드를 시작시킨다.
					t.start();
				}	
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
					try {
						if(serverSocket!=null)serverSocket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println("메인메소드 종료");
			} 
	}
}
