import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class CalculateNoOfWeekDays {

	public static int getWorkingDaysBetweenTwoDates(Date startDate, Date endDate) {
		Calendar startCal = Calendar.getInstance();
		startCal.setTime(startDate);        

		Calendar endCal = Calendar.getInstance();
		endCal.setTime(endDate);

		int workDays = 0;

		//Return 0 if start and end are the same
		if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
			return 0;
		}

		if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
			startCal.setTime(endDate);
			endCal.setTime(startDate);
		}

		do {
			//excluding start date
			startCal.add(Calendar.DAY_OF_MONTH, 1);
			if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				++workDays;
			}
		} while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); //excluding end date

		return workDays;
	}


	public static void main(String[] args) {
		Date stdt = new Date();
		String startdate = "29/07/2016";
		String enddate = "5/08/2016";

		/*SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		try{
			Date start = sdf.parse(startdate);
			Date end = sdf.parse(enddate);
			int workingDays = 0;


			while(!start.after(end));
			{
				int day = start.getDay();
				if ((day != Calendar.SATURDAY) || (day != Calendar.SUNDAY))
					workingDays++;
				System.out.println(workingDays);
				//start.add(Calendar.DATE, 1);
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}*/
	}


}
