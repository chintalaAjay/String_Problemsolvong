package java_Problems;

public class LargestWordinString {
	public static void main(String[] args) {
		String str="hello world programming";
		String arr[]=str.split("\\s");
		int max=0;
		String ans="";
		for(int i=0;i<arr.length;i++) {
			int len=arr[i].length();
			if(max<len) {
				ans=arr[i];
			}
			max=Math.max(len, max);
		}
		System.out.println(ans);
		System.out.println(max);
	}

}
