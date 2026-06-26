package java_Problems;

public class CountFrequencyOfEachCharacter {
	public static void main(String[] args) {
		String str="aaavvvbbav";
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			boolean visited=false;
//			int c=1;
			for(int j=0;j<i;j++) {
				
					if(arr[i]==arr[j]) {  
						visited=true;
						break;
					}
				
			}
			if(visited) {
				continue;
			}
			int c=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
			}
			System.out.println(arr[i]+"--->"+c);
			
		}
	}

}
