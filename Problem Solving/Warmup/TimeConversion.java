/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Sample Input 0
07:05:45PM

Sample Output 0
19:05:45
*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion 
{
    static String timeConversion(String s) 
    {
        String[] time=s.split(":");
        String output="";
        String hours=time[0];
        String minutes=time[1];
        String seconds=time[2].substring(0,2);
        String caser=time[2].substring(2,4);
        
        if(caser.equals("AM"))   
        {
            if(hours.equals("12"))
            hours="00";
            output=hours+":"+minutes+":"+seconds;
        }
        else
        {
            if(!hours.equals("12"))
            {
                 int h = Integer.parseInt(hours); 
                 h = h +12; 
                 hours =""+h; 
             }
            output=hours+":"+minutes+":"+seconds;
        }
        return output;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
