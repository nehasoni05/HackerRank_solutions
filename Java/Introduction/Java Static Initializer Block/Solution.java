/*

Input Format
There are two lines of input. The first line contains B : the breadth of the parallelogram. The next line contains H : the height of the parallelogram.

Output Format
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1
1
3

Sample output 1
3


Sample input 2
-1
2

Sample output 2
java.lang.Exception: Breadth and height must be positive

SOLUTION->
*/

mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static int B,H;
static boolean flag=false;
static 
{
    
    Scanner in=new Scanner(System.in);
    B=in.nextInt();
    H=in.nextInt();
    if(B>0 && H>0)
    flag=true;
    else if(flag==false)
    {
       System.out.println("java.lang.Exception: Breadth and height must be positive"); 
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
