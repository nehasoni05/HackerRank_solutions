/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and 
maximum values as a single line of two space-separated long integers.

Sample Input
1 2 3 4 5

Sample Output
10 14

*/
import java.math.*;
import java.util.*;
public class min_max {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        long max=Long.MIN_VALUE,min=Long.MAX_VALUE,sum=0;
        int indx=0,i;
        
        for(i=0;i<5;i++)
        arr[i]=in.nextInt();
        
        while(indx!=5)
        {
            sum=0;
        for(i=0;i<5;i++)
        {
            if(i==indx)
            continue;
            else
            sum+=arr[i];
        }
        if(sum>max)
        max=sum;
        if(sum<min)
        min=sum;
        indx++;
        }
        System.out.print(min+" "+max);
        
    }
}
