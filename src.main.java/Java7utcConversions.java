import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.DateUtils;


public class Java7utcConversions {
	public static void main(String[] args) {


		try {
			
			/*String str = "+5:30";
			String[] str1 = str.split(":");*/

			long time = System.currentTimeMillis();
			System.out.println(time);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
			sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
			System.out.println("utc time "+sdf.format(new Date(time)));
			Date date1 = sdf.parse(sdf.format(new Date(time)));

			long time2 = System.currentTimeMillis();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
			
			
		/*	System.out.println("local time "+sdf1.format(new Date(time2).getTime()+TimeUnit.HOURS.toMillis(Long.valueOf(str1[0]))+TimeUnit.MINUTES.toMillis(Long.valueOf(str1[1]))));*/
			Date date2 = sdf1.parse(sdf1.format(new Date(time2)));
	
			long diff = date1.getTime() - date2.getTime();
			int hours = (int) TimeUnit.HOURS.convert(diff, TimeUnit.MILLISECONDS);
			long diffMinutes = diff / (60 * 1000) % 60;
			System.out.println("hours"+hours+" minutes "+diffMinutes);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
