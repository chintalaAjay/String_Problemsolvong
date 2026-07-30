package java_Problems;

public class Validate_password {
	public static void main(String[] args) {
		String str="Ajay123@";
		boolean big=false;
		boolean num=false;
		boolean ch=false;
		boolean sp=false;
		for(int i:str.toCharArray()) {
			if(i>='0' && i<='9') {
				num=true;
//				break;
			}
			else if(i>='a' && i<='z') {
				ch=true;
//				break;
			}
			else if(i>='A' && i<='Z') {
				big=true;
//				break;
			}
			else {
				sp=true;
			}
		}
		if(num && ch && big && sp) {
			System.out.println("password valid");
		}
		else {
			System.out.println("password not valid");
		}
	}

}
