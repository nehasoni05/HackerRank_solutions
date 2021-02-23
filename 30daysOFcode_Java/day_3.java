/*
Task
Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird

Sample Input 0
3

Sample Output 0
Weird


Sample Input 1
24

Sample Output 1
Not Weird
*/


import java.util.*;
public class Solution 
{

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int N = scanner.nextInt();
        if(N%2==1)
        System.out.print("Weird");
        else
        {
            if(N>=6 && N<=20)
            System.out.print("Weird");
            else
            System.out.print("Not Weird");
        }
        scanner.close();
    }
}
