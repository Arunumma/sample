import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;




public class MyTimerTask extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		

		//Timer timer = new Timer();
		completeTask();
		/*Calendar today = Calendar.getInstance();
		today.set(Calendar.HOUR_OF_DAY, 16);
		today.set(Calendar.MINUTE, 50);
		today.set(Calendar.SECOND, 00);
		timer.schedule(st,today.getTime(), 24 * 60 * 60 * 1000);*/
		
	}
	
	 private void completeTask() {
	        try {
	            //assuming it takes 20 secs to complete the task
	            Thread.sleep(20000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	    
	 public static void main(String args[]){
	        TimerTask timerTask = new MyTimerTask();
	        //running timer task as daemon thread
	        Timer timer = new Timer(true);
	        
	        Calendar today = Calendar.getInstance();
			today.set(Calendar.HOUR_OF_DAY, 17);
			today.set(Calendar.MINUTE, 00);
			today.set(Calendar.SECOND, 00);
	        
	        timer.scheduleAtFixedRate(timerTask,today.getTime(), 10*1000);
	        System.out.println("TimerTask started");
	        //cancel after sometime
	        try {
	            Thread.sleep(120000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        timer.cancel();
	        System.out.println("TimerTask cancelled");
	        try {
	            Thread.sleep(30000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

}
