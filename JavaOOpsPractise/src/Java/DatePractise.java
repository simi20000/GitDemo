package Java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatePractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		Calendar cd = Calendar.getInstance();
		
		//System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		
	    System.out.println(cd.getTimeZone());
	    System.out.println(cd.DAY_OF_MONTH);
		//System.out.println(sdf.format(d));

	}

}
