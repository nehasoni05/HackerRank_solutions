/*
Sample Input
12
4.0
is the best place to learn and practice coding!

Sample Output
16
8.0
HackerRank is the best place to learn and practice coding!

EXPLANATION->
When we sum the integers 4 and 12, we get the integer 16.
When we sum the floating-point numbers 4.0 and 4.0, we get 8.0 .
When we concatenate HackerRank with is the best place to learn and practice coding!, we get HackerRank is the best place to learn and practice coding!.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day_1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int j=scan.nextInt();
        double n=scan.nextDouble();
        scan.nextLine();
        String st=scan.nextLine();
        System.out.println(i+j);
		    System.out.println(d+n);
        System.out.println(s+st);
        scan.close();
    }
}
