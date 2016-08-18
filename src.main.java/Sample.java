

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;


public class Sample {
	
	public void method1(){
		
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject.append("service", "pc");
			
		/*JSONArray array = new JSONArray();
		array.add("some");
		jsonObject.append("report", array);
		*/
	System.out.println(jsonObject);	
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void method2(){
		
		Map map = new LinkedHashMap();
		map.put("service","pc");
		List list = new ArrayList();
		list.add("some");
		map.put("report",list);
		System.out.println(map);
	}
	
	
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.method2();
		
		/* //final LocalDate start = LocalDate.now();
		 final LocalDate start = new LocalDate(2016, 7, 29);
		    final LocalDate end = new LocalDate(2016, 8, 3);

		     int workingdays = 0;
		    LocalDate weekday = start;
		    System.out.println("initial "+weekday);
		    if (start.getDayOfWeek() == DateTimeConstants.SATURDAY ||
		            start.getDayOfWeek() == DateTimeConstants.SUNDAY) {
		        weekday = weekday.plusWeeks(1).withDayOfWeek(DateTimeConstants.MONDAY);
		       // workingdays = workingdays++;
		        System.out.println("in if "+weekday);
		    }

		    while (weekday.isBefore(end)) {
		        System.out.println(weekday);

		        if (weekday.getDayOfWeek() == DateTimeConstants.FRIDAY){
		            weekday = weekday.plusDays(3);
		        workingdays = workingdays++;
		    }
		        else {
		            weekday = weekday.plusDays(1);
		        workingdays = workingdays++;
		        }
		    }
		    
		    System.out.println("workingdays  "+workingdays);*/
		
	}

}
