/*
TASK-
Let's play a game on an array! You're standing at index  of an -element array named . From some index  (where ), you can perform one of the following moves:

Move Backward: If cell  exists and contains a , you can walk back to cell .
Move Forward:
If cell  contains a zero, you can walk to cell .
If cell  contains a zero, you can jump to cell .
If you're standing in cell  or the value of , you can walk or jump off the end of the array and win the game.
In other words, you can move from index  to index , , or  as long as the destination index is a cell containing a . If the destination index is greater than , you win the game.

Input Format.
The first line contains an integer, , denoting the number of queries (i.e., function calls).
The  subsequent lines describe each query over two lines:
The first line contains two space-separated integers describing the respective values of  and .
The second line contains  space-separated binary integers (i.e., zeroes and ones) describing the respective values of .

Output Format.
Return true if you can win the game; otherwise, return false.

Sample Input
4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0

Sample Output
YES
YES
NO
NO

solution->
*/

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) 
    {
        // Return true if you can win the game; otherwise, return false.
        boolean flag =isSolvable(leap,game,0);
        return flag;
    }
    public static boolean isSolvable(int leap,int[] arr,int i)
    {
        if(i<0 || arr[i]==1)
        return false;
        if(i == arr.length-1 || (i+leap)>arr.length-1)
        return true;
        arr[i]=1;
        return isSolvable(leap,arr,i+1) || isSolvable(leap,arr,i-1) || isSolvable(leap,arr,i+leap);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
