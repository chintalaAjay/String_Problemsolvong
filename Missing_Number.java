package java_Problems;

public class Missing_Number {
	public static void main(String[] args) {
		int nums[]= {10,20,30,40,60};
		int diff=nums[1]-nums[0];
		int n=nums.length;
		for(int i=0;i<n-1;i++) {
			if(nums[i+1]-nums[i]==diff) {
				continue;
			}
			else {
				System.out.println(nums[i]+diff);
				return;
			}
		}
		System.out.println(-1);
		
	}

}
