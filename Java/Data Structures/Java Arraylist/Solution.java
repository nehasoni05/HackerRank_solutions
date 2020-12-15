/* Java Arraylist

You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in yth position of xth line. 

Input Format
The first line has an integer n. In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated
integers. In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y.

Output Format
In each line, output the number located in yth position of xth line. If there is no such position, just print "ERROR!"

Sample Input
5                            //testcases
5 41 77 74 22 44             //no. of elements and elements
1 12
4 37 34 36 52
0
3 20 22 33
5                           //no. of queries
1 3
3 4
3 1
4 3
5 5

Sample Output
74
52
37
ERROR!
ERROR!

SOLUTION->
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
    int t,n,i,x,y,q;
    ArrayList<ArrayList> arrList=new ArrayList<ArrayList>();
    Scanner in=new Scanner(System.in);
    t=in.nextInt();
    while(t--!=0)
    {
        n=in.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(i=0;i<n;i++)
        {
            list.add(in.nextInt());
        }
        arrList.add(list);
    }
     q=in.nextInt();
    while(q--!=0)
    {
        x=in.nextInt()-1;
        y=in.nextInt()-1;
        if(x<arrList.size() && y<arrList.get(x).size())
        {
            System.out.println(arrList.get(x).get(y));
        }
        else
        {
            System.out.println("ERROR!");
        }
    }
       
    }
}
