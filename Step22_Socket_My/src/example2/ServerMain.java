package example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*	[용어]
 *  overwrite: 재정의
 *  overload: 다중 
 */

import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		Socket socket=null;
			try {
				//5000번에서 클라이언트의 접속을 기다릴 수 있는
				// ServerSocket 객체를 생성해서 참조값을 변수에 넣기.
				serverSocket=new ServerSocket(5000);
				
				//무한루프를 돌면서 
				while(true) {
					//누군가 연결 요청하기 전까지는 실행을 안함.
					//클라이언트의 접속을 기다린다.
					socket=serverSocket.accept();
					System.out.println("클라이언트가 접속함!");
					// socket변수안에는 방금 연결 요청을한
					// 클라이언트와 연결된 소켓 객체의 참조값이 들어있다.
					String ip=socket.getInetAddress().getHostAddress();
					// 클라이어트가 전솔하는 데이터를 읽어들일수 있는 객체
					InputStream is=socket.getInputStream();
					// inputstream은 int를 반환하는 객체로 String을 반환하는 객체가 없어서 기능을
					// 업시켜야 함으로 input StreamReader와 bufferedreader 가 필요하다.
					InputStreamReader isr=new InputStreamReader(is);
					BufferedReader br=new BufferedReader(isr);
					//클라이언트가 전송한 문자열 읽어내기.
					String msg=br.readLine();
					//콘솔창에 출력하고
					System.out.println(ip+":"+msg);
					//socket객체 닫기
					socket.close();
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
