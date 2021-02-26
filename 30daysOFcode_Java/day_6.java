/*
Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample 
below for more detail).
Note: 0 is considered to be an even index.

Sample Input
2
Hacker
Rank

Sample Output
Hce akr
Rn ak
*/


import java.util.*;
public class Solution {

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int i;
        while(t--!=0)
        {
        String str=in.next();
        for(i=0;i<str.length();i+=2)
        {
            System.out.print(str.charAt(i));
        }
        System.out.print(" ");
        for(i=1;i<str.length();i+=2)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        }
        
    }
}
