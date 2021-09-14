package string;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDateEx {
	String data;
	boolean flag=true;
	
	
	public void checkIfStringIsNumric(String data)
	{
		this.data=data;
		
		try {
			float f1= Float.parseFloat(this.data);
		} catch (NumberFormatException e) {
			
			flag=false;
		}
		
		if(flag)
			System.out.println("Its a number");
		else
			System.out.println("Not a number");
		
	}

	public static void main(String[] args) {
		StringToDateEx str=new StringToDateEx();
		
		str.checkIfStringIsNumric("ghfj");
		
		String date= "2017-07-25";
		
		LocalDate date1=LocalDate.parse(date,DateTimeFormatter.ISO_DATE);
		System.out.println(date1);
		

	}

}
