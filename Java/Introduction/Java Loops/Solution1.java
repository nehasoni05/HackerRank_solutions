/*Task You are given q queries in the form of a, b, and n For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.

Input Format

The first line contains an integer, q denoting the number of queries. 
Each line i of the q subsequent lines contains three space-separated integers describing the respective a-th b-th and n-th values for that query.

Constraints
 0<= q <= 500
 0<= a,b <= 50
 1<= n <= 15

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.

Sample Input

2
0 2 10
5 3 5

Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

SOLUTION->
//

import java.util.*;
import java.io.*;

class Solution1
{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            
            int s=0,power,c=0;
            power=(int)Math.pow(2,c);
            s+=(a+power*b);
            System.out.print(s+" ");
        for(int j=1;j<n;j++)
        {
            c++;
            power=(int)Math.pow(2,c);
            s+=(power*b);
            System.out.print(s+" ");
            
        }
        System.out.println();
        }
        in.close();
        
    }
}
