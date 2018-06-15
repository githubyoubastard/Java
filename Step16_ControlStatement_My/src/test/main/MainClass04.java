package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		// int 배열
		int[] nums= {10, 20, 30, 40, 50};
		for(int i=0;i<nums.length;i++) {
			int tmp=nums[i];
			System.out.println("tmp:"+tmp);
		}
		System.out.println("== 확장 for 문 ==");
		
		for (int tmp:nums) {
			System.out.println("tmp:"+tmp);
		}
	}
}
