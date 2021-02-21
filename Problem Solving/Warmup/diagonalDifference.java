/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix a is shown below:

1 2 3
4 5 6
9 8 9  
The left-to-right diagonal 1+5+9=15 . The right to left diagonal 3+5+9 =17 . Their absolute difference is |15-17|=2.
*/

import java.util.*;
import java.lang.Math; 

public class Solution {
    public static void main(String[] args) 
    {
        int i,n,j,sum1=0,sum2=0,diff;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int[][] a=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            a[i][j]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                sum1+=a[i][j];
                if(i+j==n-1)
                sum2+=a[i][j];
            }
        }
        
        diff=Math.abs(sum1-sum2);
        System.out.println(diff);
    }
      
}
