/*
Input Format
The first line contains a string denoting a.
The second line contains a string denoting b.

Output Format

Print "Anagrams" if a and b are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

Sample Input 0
anagram
margana

Sample Output 0
Anagrams

SOLUTION->
*/

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) 
    {
        // Complete the function
        int i,count=0;
        String st1=a.toLowerCase();
        String st2=b.toLowerCase();
        
        char[] array1=st1.toCharArray();
        char[] array2=st2.toCharArray();
        if(array1.length==array2.length)
        {
        for(i=0;i<array1.length;i++)
        {
            for(int j=0;j<array2.length;j++)
            {
                if(array1[i]==array2[j])
                {
                    count++;
                    array2[j]=' ';
                    break;
                }
                else
                {
                    continue;
                }
            }
        }
        if(count==array1.length)
        return true;
        else
        return false;
        }
        else
        {
            return false;
        }
        
    }
    

    public static void main(String[] args) {
