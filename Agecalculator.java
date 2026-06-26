package java_Problems;

import java.time.*;

public class Agecalculator {
	public static void main(String[] args) {
		String str="2005-05-23";
		LocalDate dob=LocalDate.parse(str);
		LocalDate today=LocalDate.now();
		Period age=Period.between(dob, today);
		System.out.println("years"+age.getYears());
		System.out.println("months"+age.getMonths());
		System.out.println("days"+age.getDays());
		
	}

}
