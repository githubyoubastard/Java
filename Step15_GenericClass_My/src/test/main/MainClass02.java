package test.main;

import test.mypac.Apple;
import test.mypac.Banana;
import test.mypac.BananaBox;
import test.mypac.FruitBox;
import test.mypac.Orange;
import test.mypac.OrangeBox;

public class MainClass02 {
	public static void main(String argus) {
		//apple 객체를 담을 수 있는 Fruitbox 객체 생성
		FruitBox<Apple> aBox=new FruitBox<Apple>();
		aBox.push(new Apple());
		
		FruitBox<BananaBox> bBox=new FruitBox<BananaBox>();
		bBox.push(new Banana());
		
		FruitBox<OrangeBox> oBox=new FruitBox<>();
		oBox.push(new Orange());
	}
}
