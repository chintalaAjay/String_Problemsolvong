package java_Problems;

public class SnakeCasetoCamelCase {
	public static void main(String[] args) {
		String str="java_full_stack";
		String arr[]=str.split("_");
		StringBuilder sb=new StringBuilder();
		sb.append(arr[0]);
		for(int i=1;i<arr.length;i++) {
			char ch[]=arr[i].toCharArray();
			for(int j=0;j<ch.length;j++) {
				if(j==0) {
					sb.append(Character.toUpperCase(ch[j]));
				}
				else {
					sb.append(ch[j]);
				}
			}
			
			
		}
		System.out.println(sb.toString());
		
	}

}
