package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
	MyRemocon r1=new MyRemocon();
	Remocon r2=new MyRemocon();
	Object r3=new MyRemocon();
	
	useRemocon(r1);
	useRemocon(r2);
	useRemocon((Remocon)r3);
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
