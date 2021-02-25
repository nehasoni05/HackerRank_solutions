/*
At HackerLand University, a passing grade is any grade 40 points or higher on a 100 point scale. Sam is a professor at the university and likes to round each student’s grade according to the following rules:
If the difference between the grade and the next higher multiple of 5 is less than 3, round to the next higher multiple of 5
If the grade is less than 38, don’t bother as it’s still a failing grade
Automate the rounding process then round a list of grades and print the results.

Sample Input 0
4
73
67
38
33

Sample Output 0
75
67
40
33
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */
    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    int val,nextMultiple;
        for(int i=0; i<grades.size(); i++)
        {
            val=grades.get(i);
            if(val<38)
            grades.set(i,val);
            else if(val%5 < 3)
            grades.set(i,val);
            else
            grades.set(i,(val+(5-(val%5))));
        }
        return grades;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = Result.gradingStudents(grades);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
