package java_Problems;

public class Day_Check {
	public static void main(String[] args) {
		int day=4;
		switch (day) {
		case 1: 
		case 2:
		case 3:
		case 4:
		case 5:
		
			System.out.println("weekday");
			break;
			
		case 6:
		case 7:
			System.out.println("weekend");
			break;
		default:
			System.out.println("Invalid day, enter between 1-7");
		}
		
	}

}
