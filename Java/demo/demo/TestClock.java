import java.util.*;

public class TestClock {
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);

        // get input
	    System.out.print("What is the hour? ");
	    int in_hour = in.nextInt();
	    
	    System.out.print("What is the minute? ");
	    int in_minute = in.nextInt();
	    
	    System.out.print("What is the second? ");
	    int in_second = in.nextInt();

		Clock c1 = new Clock();
		c1.setTime(in_hour, in_minute, in_second);
		System.out.print("The current time is: ");
		c1.showTime();
			
	}
}