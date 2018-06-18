package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		List<Object> list=new ArrayList<Object>();
		//Generic 은 Object 이지만 Car 객체를 담을 수 있다.
		list.add(new Car());
		list.add(new Car());
		list.add(new Car());
		
		// 0번방 참조
		Object room1=list.get(0);
		Object room2=list.get(1);
		// Object는 상위라 객체 타입을 Car로 하려면 (Car)캐스팅을 해야한다. Step08_WrapperClass 참조
		Car room3=(Car)list.get(2);
		
		/*     	<JavaScript>		|            <Java>
		 *     var nums=[];			|	List<Integer> nums=new ArrayList<>();
		 *     		nums.push(10);	|					nums.add(10);
		 *     		nums.push(20);	|					nums.add(20);
		 *     
		 *     
		 *    		 <JavaScript>		|            <Java>
		 *    var nums=[];			|	List<String> nums=new ArrayList<>();
		 *    nums.push("유수열");	|		nums.add("유수열");
		 *    	nums[0]="유수열";		| 		nums.get(0)="유수열";
		 *    
		 *    
		 *    		 				<JavaScript>		|            <Java>
		 *    var list=[];								|	List<Car> list=new ArrayList<>();
		 *    list.push({});							|		list.add(new Car());
		 *    {name:"aa",drive:function(){}}	| 		class Car{
		 *    																		public String name="aa";
		 *    																		public void drive(){
		 *    																										};
		 */
	}
}
