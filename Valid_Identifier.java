package java_Problems;

public class Valid_Identifier {
	public static void main(String[] args) {
		String str="my-var";
		char f=str.charAt(0);
		if(!(Character.isLetter(f) || f=='_' || f=='$')) {
			System.out.println("Invalid Identifier");
			return;
		}
		char arr[]=str.toCharArray();
		for(int i=1;i<arr.length;i++) {
			if(!(Character.isDigit(arr[i]) || Character.isLetter(arr[i])   || arr[i]=='_' || arr[i]=='$')) {
				System.out.println("Invalid identifier");
				return;
			}
		}
		String keywords[] = {
			    "abstract", "assert", "boolean", "break", "byte",
			    "case", "catch", "char", "class", "const",
			    "continue", "default", "do", "double", "else",
			    "enum", "extends", "final", "finally", "float",
			    "for", "goto", "if", "implements", "import",
			    "instanceof", "int", "interface", "long", "native",
			    "new", "package", "private", "protected", "public",
			    "return", "short", "static", "strictfp", "super",
			    "switch", "synchronized", "this", "throw", "throws",
			    "transient", "try", "void", "volatile", "while"
			};
		for(String i:keywords) {
			if(str.equals(i)) {
				System.out.println("Invalid identifier");
				return;
			}
		}
		System.out.println("valid identifier");
		
	}

}
