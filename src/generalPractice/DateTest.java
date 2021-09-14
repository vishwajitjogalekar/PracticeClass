package generalPractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
	long milli=System.currentTimeMillis();
	java.util.Date date=new java.util.Date(milli);
	System.out.println("Date is- "+date);
	
	// Simple date Example
	
	Date dt=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyy");
	String str= sdf.format(dt);
	String xyz=sdf.format(System.currentTimeMillis());
	System.out.println(str);
	System.out.println(xyz);
	
	
	
	
	

	}

}
