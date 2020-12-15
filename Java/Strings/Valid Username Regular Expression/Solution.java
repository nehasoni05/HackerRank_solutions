/*
Regular expressions (regexp) help us match or search for patterns in strings. In this problem, you will be given a username. 

Your task is to check whether that username is valid. A valid username will have the following properties:
1) The username can contain alphanumeric characters and/or underscores(_).
2) The username must start with an alphabetic character.
3) 8 ≤ |Username| ≤ 30.

Input Format
The first line of input contains an integer N, representing the number of testcases. Each of the next N lines contains a 
string that represents a username.

Output Format
For each username, output Valid if the username is valid; otherwise, output Invalid.

Sample Input
4
alpha_naheed
xahidbuffon
nagib@007
123Swakkhar

Sample Output
Valid
Valid
Invalid
Invalid

SOLUTION->
*/

import java.util.Scanner;
class UsernameValidator 
{
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
