package rb.dates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DatesUtil implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		Double d1 = Double.valueOf(s1);
		Double d2 = Double.valueOf(s2);
		return d2.compareTo(d1);
	}


	public static void main(String[] args) {
		DatesUtil util = new DatesUtil();
		util.compareDates();		

	}
	
	
	public void compareDates() {
		
		List<String> dates = new ArrayList<>();
		/*
		 * 1. Use date format as yyyyMMddHHmmss.SSSSSS in java 
		 * 2. Retrieve as string (as new column) in same format (yyyyMMddHHmmss.SSSSSS) from database
		 * 3. This will work only if months, days,HH24, minutes, seconds are in two digits. Check if retrieved dates from DB meet this criteria
		 *    -Example 
		 *    	20180404234011.123456 is correct
		 *    	201844234011.123456 is incorrect - notice no zeros before month and day
		 */
		
		dates.add("20180404234011.123456");
		dates.add("20180404234211.123456");
		dates.add("20180404234311.123456");
		dates.add("20180405000000.123456");
		dates.add("20180404234312.1234");
		
		System.out.println("Before: " + dates);
		Collections.sort(dates, this);
		System.out.println("After: " + dates);
		
		
		
	}

}
