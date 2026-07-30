package java_Problems;

public class Stringcompression {
	public static void main(String[] args) {
		String str="abbccccd";
		int n=str.length();
		StringBuilder sb=new StringBuilder();
		int c=1;
		for(int i=0;i<n-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				c++;
			}
			else {
				sb.append(str.charAt(i));
				sb.append(c);
				c=1;
			}
			
		}
		sb.append(str.charAt(str.length()-1));
		sb.append(c);
		System.out.println(sb);
	}

}
