/*
Input Format
A single string s

Output Format
On the first line, print an integer, n, denoting the number of tokens in string  s(they do not need to be unique). Next, print each of the  n
tokens on a new line in the same order as they appear in input string s.

Sample Input
He is a very very good boy, isn't he?

Sample Output
10
He
is
a
very
very
good
boy
isn
t
he

SOLUTION->
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s.trim();


      StringTokenizer st = new StringTokenizer(s,("[_\\@!?.', ]"));

        int x = st.countTokens();
        System.out.println(x);
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
        scan.close();

    }
}

