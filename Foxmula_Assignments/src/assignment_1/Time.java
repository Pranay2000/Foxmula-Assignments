package assignment_1;

public class Time {
	private int hour, minute, second;
		
	public Time(int hr, int min, int sec) {
		this.hour = hr;
		this.minute = min;
		this.second = sec;
		
		FormatSeconds();
		FormatMinutes();
	}
		
	public void Add(Time t1){
		int totalHours, totalMinutes, totalSeconds;

		totalSeconds = this.second + t1.second;
		totalMinutes = this.minute + t1.minute;
		totalHours = this.hour + t1.hour;

		totalMinutes += totalSeconds / 60;
		totalSeconds %= 60;
		
		totalHours += totalMinutes / 60;
		totalMinutes %= 60;

		System.out.println(totalHours + " hours " 
							+ totalMinutes + " minutes " 
							+ totalSeconds + " seconds" + "\n");
	    }

	    private void FormatSeconds(){
	        this.minute += this.second / 60;
	        this.second %= 60;
	    }

	    private void FormatMinutes(){
	        this.hour += this.minute / 60;
	        this.minute %= 60;
	    }
}
