/*
Java Regex 2 - Duplicate Words
When we write something, it is easy to repeat words by mistake. For example: Monmoy loves to to code. Here, "to" is written multiple times.

Using Regex, we can easily identify the repeated pattern in a given text. In this problem, you will be given a text.  Your task is to identify the consecutively repeated words
and delete them after the first occurrence of the word.

The first line of input contains an integer N, representing the number of testcases. The next N lines contain a string of English letters and whitespaces.

Sample Input
4
Goodbye bye bye world world world
Swapnil went went to to to his business
Rana is is the the best player in eye eye game
in inthe

Sample Output
Goodbye bye world
Swapnil went to his business
Rana is the best player in eye game
in inthe

SOLUTION->
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}
