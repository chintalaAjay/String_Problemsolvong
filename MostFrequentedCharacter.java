package java_Problems;

public class MostFrequentedCharacter {
	public static void main(String[] args) {
		String str="hellooo";
		int max=0;
		char ans = 0;
		for(int i:str.toCharArray()) {
			int c=0;
			for(int j:str.toCharArray()) {
				if(i==j) c++;
				if(c>max) {
					max=c;
					ans=(char) i;
				}
			}
		}
		System.out.println(ans);
	}

}
