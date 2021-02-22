/*
You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the 
tallest of the candles. Count how many candles are tallest.

Sample Input 0
4
3 2 1 3

Sample Output 0
2

Explanation 0
Candle heights are [3,2,1,3] . The tallest candles are 3 units, and there are 2 of them.
*/

import java.math.*;
import java.util.*;

public class Solution {
    public static void main(String[] args)
    {
        int i,n,count=0,max=-1;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int[] ar=new int[n];
        for(i=0;i<n;i++)
        {
        ar[i]=in.nextInt();
        
        if(max<ar[i])
        max=ar[i];
        }
        for(i=0;i<n;i++)
        {
            if(ar[i]==max)
            count++;
        }
        System.out.println(count);
    }
}
