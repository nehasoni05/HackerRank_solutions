/*
Task
Given an array, A , of N integers, print A's elements in reverse order as a single line of space-separated numbers.

Sample Input
4
1 4 3 2

Sample Output
2 3 4 1
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
        int n = scanner.nextInt();
        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) 
        {
            arr[i]=scanner.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--)
        System.out.print(arr[i]+" ");

        scanner.close();
    }
}
