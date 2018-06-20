package test.mypac;

public class Player extends Thread {
	private String name;
	public Player(String name) {
	this.name=name;
	}
	public void run() {
		System.out.println(name+"이(가) 달리고 있음 ");
		int count=0;
		while(true) {
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			count++;
			System.out.println(name+" : "+count+" 번째 수행중");
		}
	}
	
}
