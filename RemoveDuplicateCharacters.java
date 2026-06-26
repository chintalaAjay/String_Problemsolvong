package java_Problems;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		String str="programming";
		StringBuilder sb= new StringBuilder();
		for(char x:str.toCharArray()) {
			if(sb.indexOf(String.valueOf(x))==-1) {
				sb.append(x);
				
			}
		}
		System.out.println(sb.toString());
	}

}
