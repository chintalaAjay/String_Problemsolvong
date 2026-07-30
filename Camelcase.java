package java_Problems;

public class Camelcase {
	public static void main(String[] args) {
		String str="hello java";
		StringBuilder sb=new StringBuilder();
		boolean next=false;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				next=true;
				
			}
			else {
				if(next) {
					char x=Character.toUpperCase(ch);
					sb.append(x);
					next=false;

				}
				else {
					sb.append(ch);
					next=false;
				}
			}
		}
		System.out.println(sb.toString());
	}

}
