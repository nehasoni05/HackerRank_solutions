/*
Given a string A, print Yes if it is a palindrome, print No otherwise.

Sample Input
madam

Sample Output
Yes

SOLUTION->
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String str="";
        for(int i=A.length()-1;i>=0;i--)
        {
            str+=A.charAt(i);
        }
        
        if(A.equals(str))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
        
    }
}
