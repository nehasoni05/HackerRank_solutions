/*
Problem :
Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as
follows:

• If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine = 0).
• If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, fine = 15 Hackos * (the number of days late).
• If the book is returned after the expected return month but still within the same calendar year as the expected return date, the fine = 500 Hackos * (the number of months late).
• If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000 Hackos.

Charges are based only on the least precise measure of lateness. For example, whether a book is due January 1, 2017 or December 31, 2017, if it is returned January 1, 2018, that is a year late and the fine would be 10,000 Hackos.

Sample Input

STDIN       Function
-----       --------
9 6 2015    day = 9, month = 6, year = 2015 (date returned)
6 6 2015    day = 6, month = 6, year = 2015 (date due)
Sample Output

45

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int return_day=in.nextInt();
        int return_month=in.nextInt();
        int return_year=in.nextInt();
        
        int actual_day=in.nextInt();
        int actual_month=in.nextInt();
        int actual_year=in.nextInt();
        
        if(return_year==actual_year)
        {
            if(return_month==actual_month)
            {
                if(return_day>actual_day)
                    System.out.print(15*(return_day-actual_day));
                
                else
                    System.out.print("0");    
            }
            else if (return_month > actual_month)
            System.out.print(500*(return_month-actual_month));
            
            else 
            System.out.print("0");
        }
        else if(return_year>actual_year)
        {
            System.out.print("10000");
        }
        else
        System.out.print("0");
        
    }
}
