import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class UtcToLocalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calendar calendar = Calendar.getInstance();
		Date date  = calendar.getTime();
		
		
		SimpleDateFormat dateFormatGmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateFormatGmt.setTimeZone(TimeZone.getTimeZone("UTC"));
		String str = dateFormatGmt.format(date);
		System.out.println(str);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		LocalDateTime currentDateTime = LocalDateTime.now();
		//String str2 = dateFormat.format(currentDateTime);
		System.out.println(currentDateTime);
		
		

	}

}
