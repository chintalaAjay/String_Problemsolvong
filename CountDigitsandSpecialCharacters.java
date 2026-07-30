package java_Problems;

public class CountDigitsandSpecialCharacters {
	public static void main(String[] args) {
		String str="123ahbZ&AbBV@#%g";
		str=str.toLowerCase();
		int dig=0;
		int spe=0;
		for(char x:str.toCharArray()) {
			if(x>='0' && x<='9') dig++;
			else if(!(x>='a' && x<='z')) {
				spe++;
			}
		}
		System.out.println("Digits:"+dig);
		System.out.println("special Characters: "+spe);
	}

}
