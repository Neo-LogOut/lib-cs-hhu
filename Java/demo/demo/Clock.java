
public class Clock {

	int hour;
	int minute;
	int second;
	
	public void setTime(int newH, int newM, int newS){
		hour = newH;
		minute = newM;
		second = newS;
	}	
	
	public void showTime(){
		System.out.println(hour+" : "+minute+" : "+second);
	}
}
