package java_Problems;

public class LongestSubStringwithoutrepeatingcharacters {
	public static void main(String[] args) {
		String str="welcome to java";
		str=str.replace(" ","");
		String ans="";
		int max=0;
		for(int i=0;i<str.length();i++) {
			StringBuilder sb=new StringBuilder();
			for(int j=i;j<str.length();j++) {
				 char ch = str.charAt(j);
				if(sb.indexOf(String.valueOf(ch))!=-1) {
					break;
				}
				sb.append(ch);
			}
			if(sb.length()>max) {
				max=sb.length();
				ans=sb.toString();
			}
		}
		System.out.println(ans);
		System.out.println(max);
	}

}
