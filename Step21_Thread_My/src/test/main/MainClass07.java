package test.main;

//MainClass05,06와 관련

public class MainClass07 {
	public static void main(String[] args) {
		
		//익명의 로컬 이너클래스를 이용하면 runnable interface 참조값을 쉽게 할 수 있다. 
		Runnable run1=new Runnable() {
			@Override
			public void run() {
				System.out.println("새로운 작업단위임");
			}
		};
		new Thread(run1).start();
		
		
		
		
		//위의 코드를 좀 더 간략하게 적는건?
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("새로운 작업단위임2");
			}}).start();
	}
}
