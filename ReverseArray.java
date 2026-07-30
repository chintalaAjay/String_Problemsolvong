package java_Problems;

public class ReverseArray {
	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5};
		int k=2;
		int l=0;
		int r=nums.length-1;
		rev(nums,l,k-1);
		rev(nums,k,r);
		rev(nums,l,r);
		for(int i:nums) {
			System.out.print(i+", ");
		}
		
	}
	public static void rev(int nums[],int l,int r) {
		while(l<r) {
			int temp=nums[l];
			nums[l]=nums[r];
			nums[r]=temp;
			l++;
			r--;
		}
		
		
	}

}
