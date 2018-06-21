package test.frame;

import javax.swing.JFrame;

/*
 *  [ GUI Frame ]
 *  
 *  	- JFrame 클래스를 상속 받은 클래스를 정의한다.
 *  	- 해당 클래스로 객체 생성을 한다.
 */

public class HelloFrame extends JFrame{
	//생성자
	public HelloFrame() {
		//크기와 위치 설정 .setBounds(x,y,width,height)
		this.setBounds(300, 300, 500, 300);
		// x를 눌렀을때 프로세스가 종료되도록 설정
		this.setDefaultCloseOperation(HelloFrame.EXIT_ON_CLOSE);
		//화면에 보이도록 설정
		this.setVisible(true);
		this.setTitle("제목입니다.");
	}
	// HelloFrame 클래스로 객체를 생성하기 위한 main 메소드
	public static void main(String[] args) {
		new HelloFrame();
	}
}
