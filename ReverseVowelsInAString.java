package java_Problems;

public class ReverseVowelsInAString {
	public static void main(String[] args) {
		String str="sirisha";
		str=str.toLowerCase();
		String vow="aeiou";
		StringBuilder sb=new StringBuilder();
		for(char x:str.toCharArray()) {
			if(vow.indexOf(x)!=-1) {
				sb.append(x);
			}
		}
		System.out.println(sb.reverse().toString());
	}

}
