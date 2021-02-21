/*
The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].
If a[i] > b[i], then Alice is awarded 1 point.
If a[i] < b[i], then Bob is awarded 1 point.
If a[i] = b[i], then neither person receives a point.

Sample Input 0
5 6 7
3 6 10

Sample Output 0
1 1

*/

import java.util.*;
class compareTriplets
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int i,count1=0,count2=0;
        int[] a=new int[3];
        int[] b=new int[3];
        for(i=0;i<3;i++)
        {
            a[i]=in.nextInt();
        } 
        for(i=0;i<3;i++)
        {
            b[i]=in.nextInt();
        }
        for(i=0;i<3;i++)
        {
            if(a[i]>b[i])
            count1++;
            else if(a[i]<b[i])
            count2++;
        }
        System.out.print(count1+" "+count2);
    }
}
