package java_Problems;

import java.util.Arrays;

public class AnagramCheck {
	public static void main(String[] args) {
		String str1="silent";
		String str2="listen";
		if(str1.length()!=str2.length()) {
			System.out.println(false);
			return;
		}
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(!Arrays.equals(ch1, ch2)) {
			System.out.println(false);
			return;
		}
//		for(int i=0;i<ch1.length;i++) {
//			if(ch1[i]!=ch2[i]) {
//				System.out.println(false);
//				return;
//			}
//		}
		System.out.println(true);
		
	}

}
