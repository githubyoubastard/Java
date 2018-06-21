package example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerThread extends Thread {
	//필드
	//클라이언트와 연결된 socket의 참조값을 저장할 필드
	private Socket socket;
	
	//생성자의 인자로 socket 객체를 받아서 필드에 저장
	public ServerThread(Socket socket) {
		this.socket=socket;
	}
	
	@Override
	public void run() {
		//클라이언트와 1:1로 처리할 코드를 작성하면 된다.
		BufferedReader br=null;
		try {
				br=new BufferedReader
					(new InputStreamReader(socket.getInputStream()));			
			//접속한 클라이언트의 ip주소
			String ip=socket.getInetAddress().getHostAddress();
			//무한 루프를 돌면서 클라이언트가 전송한 문자열을 읽는다.
			while(true) {
				String msg=br.readLine();
				if(msg!=null)System.out.println(ip+" : "+msg);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {

				try {
					if(socket!=null)socket.close();
					if(br!=null)br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
