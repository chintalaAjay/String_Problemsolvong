package java_Problems;

public class FirstNonRepeatingcharacter {
	public static void main(String[] args) {
		String str="aabbcdeff";
		char a[]=str.toCharArray();
		for(int i=0;i<a.length;i++) {
//			int count=0;
			boolean single=true;
			
			for(int j=0;j<a.length;j++) {
				if(i!=j) {
					if(a[i]==a[j]) {
//						count++;
						single=false;
						break;
					}
				}
			}
			if(single) {
				System.out.println(a[i]);
				return;
			}
		}
	}

}
