package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {
			
			@Override
			public void up() {
				System.out.println("TURN IT UP BITCH");
			}
			
			@Override
			public void down() {
				System.out.println("TURN IT DOWN YOU DEAFFFF");
			}
		};
		useRemocon(r1);
		
		useRemocon(new Remocon() {
			@Override
			public void up() {
				System.out.println("온도를 올려요");
			}
			@Override
			public void down() {
				System.out.println("온도를 낮춰요");
			}
		});
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
