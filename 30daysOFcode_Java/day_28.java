/*
Task
Consider a database table, Emails, which has the attributes First Name and Email ID. Given N rows of data simulating the Emails table, print an alphabetically-ordered list of 
people whose email address ends in @gmail.com (RegEx Pattern)

Sample Input
6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
ghanendra ghanendra.yadav@gmail.com

Sample Output
ghanendra
julia
julia
riya
samantha
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int N = scanner.nextInt();
        
        ArrayList<String> list=new ArrayList<>();
        String emailExpr= ".+@gmail\\.com$";
        Pattern pattern=Pattern.compile(emailExpr);
        
        for (int NItr = 0; NItr < N; NItr++) 
        {
            String firstName = scanner.next();
            String emailID = scanner.next();
            
            Matcher match=pattern.matcher(emailID);
            if(match.find())
            list.add(firstName);
        }
        
        Collections.sort(list);
        for(String name:list)
        System.out.println(name);
        
        
        scanner.close();
    }
}
