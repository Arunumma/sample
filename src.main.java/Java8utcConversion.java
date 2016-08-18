import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;





public class Java8utcConversion {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/**
		 * java 8 localdate time
		 */
		/*LocalDateTime datetime = LocalDateTime.now();
			ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
			//OffsetDateTime date = OffsetDateTime.of(datetime, ZoneOffset.UTC);  

			System.out.println("Date and Time with timezone offset in Java : " + datetime);*/

		long time = System.currentTimeMillis();
		System.out.println(time);
		LocalDateTime ldt = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneOffset.UTC);
		//System.out.println(ldt);
		LocalDateTime ldt2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneOffset.systemDefault());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ");
		String ldt1 = ldt.format(formatter);
		LocalDateTime dateTime = LocalDateTime.parse(ldt1, formatter);
		
		System.out.println(dateTime);
		
		System.out.println("     "+ldt+"        "+ldt2);
		
		
		
		LocalDateTime tempDateTime = LocalDateTime.from( ldt );
		//long hours = tempDateTime.until( ldt2, ChronoUnit.HOURS);
		tempDateTime = tempDateTime.plusHours( 5 );
		tempDateTime = tempDateTime.plusMinutes( 30 );
		System.out.println("tempDateTime1  "+tempDateTime);
		long minutes = tempDateTime.until( ldt2, ChronoUnit.MINUTES);
		//tempDateTime = tempDateTime.plusMinutes( minutes );
		System.out.println("tempDateTime "+minutes);
		
		
		Duration duration = Duration.between(ldt, ldt2);
		System.out.println(duration);
		
		long minutes1 = ChronoUnit.MINUTES.between(ldt, ldt2);
		long hours1 = ChronoUnit.HOURS.between(ldt, ldt2);
		
		System.out.println(" "+hours1+":"+minutes1);
	}

}
