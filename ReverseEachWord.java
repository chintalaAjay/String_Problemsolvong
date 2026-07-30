package java_Problems;

public class ReverseEachWord {
	public static void main(String[] args) {
		String str="Hello World";
		String arr[]=str.split(" ");
		for(String s:arr) {
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			System.out.print(sb.toString()+" ");
		}
	}

}
