/*
Write the following declarations and implementations:

Two instance variables: one for your , and one for your .
A void pushCharacter(char ch) method that pushes a character onto a stack.
A void enqueueCharacter(char ch) method that enqueues a character in the instance variable.
A char popCharacter() method that pops and returns the character at the top of the instance variable.
A char dequeueCharacter() method that dequeues and returns the first character in the instance variable.

Sample Input
racecar

Sample Output
The word, racecar, is a palindrome.
*/

import java.io.*;
import java.util.*;

public class Solution 
{
    // Write your code here.
    int top=-1,front=-1,rear=-1;
    char[] stack=new char[100];
    char[] queue=new char[100];
    
    void pushCharacter(char ch)
    {
        top++;
        stack[top]=ch;
    }
    void enqueueCharacter(char ch)
    {
        if(front==-1 && rear==-1)
        {
            front=0;
            rear=0;
        }
        else
        {
            rear++;
        }
        queue[rear]=ch;
    }
    int popCharacter()
    {
        return stack[top--];
    }
    int dequeueCharacter()
    {
        if(front>rear)
        return -1;
        
        return queue[front++];
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
