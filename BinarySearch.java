package java_Problems;

public class BinarySearch {
	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5};
		int n=nums.length;
		int target=6;
		int l=0;
		int h=n-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(target==nums[mid]) {
				System.out.println(mid);
				return;
			}
			else {
				if(target>nums[mid]) {
					l=mid+1;
				}
				else {
					h=mid-1;
				}
			}
		}
		System.out.println("-1");
		
	}

}
