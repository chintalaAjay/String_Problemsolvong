package java_Problems;

public class MissingNumberPosition {
	public static void main(String[] args) {
		int nums[]= {10,20,30,40,60};
		int n=nums.length;
		int diff=nums[1]-nums[0];
		int target=50;
		int l=0;
		int h=n-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(nums[mid]+diff==target) {
				System.out.println(target+" inserted at ->"+(mid+1));
				return;
			}
			else if(target>nums[mid]) {
				l=mid+1;
			}
			else {
				h=mid-1;
			}
		}
		System.out.println(-1);
	}

}
