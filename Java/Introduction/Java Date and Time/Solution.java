/*
Input Format

A single line of input containing the space separated month, day and year, respectively, in  MM/DD/YYYY  format
Output Format
Output the correct day in capital letters.

Sample Input
08 05 2015

Sample Output
WEDNESDAY

solution->
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static String findDay(int month, int day, int year) {
       String weekDay=null;
       try
       {
       String date=day+"/"+month+"/"+year;
       Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);
       SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");  
       weekDay=simpleDateformat.format(date1).toUpperCase( );
       }
       catch(Exception ex)
        {
             System.out.println(ex);
        }
        return weekDay;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
