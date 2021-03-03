/*
Task
Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

Sample Input
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output
19
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

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int i,j,sum=0,min=-2147483648;
        for (i = 0; i < 6; i++) 
        {
            for (j = 0; j < 6; j++) 
            {
                arr[i][j] = scanner.nextInt();
            }
        }
        int sum=0,min=-2147483648;
        for(i=0;i<4;i++)
        {
            sum=0;
            for(j=0;j<4;j++)
            {
                sum=0;
                sum+=arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                    arr[i+1][j+1]+
                    arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sum>min)
                min=sum;    
            }
        }
        System.out.print(min);
        

        scanner.close();
    }
}
