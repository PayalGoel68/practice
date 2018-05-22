package javaLearningPackage;
import java.text.SimpleDateFormat;

public class Date {
	
	public static void main(String[] args) {
		 
        Date now = new Date();
        System.out.println(now.toString());
 
        SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        System.out.println("Format 1:   " + dateFormatter.format(now));

        dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Format 2:   " + dateFormatter.format(now));
        
        dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        System.out.println("Format 3:   " + dateFormatter.format(now));
    }
}
