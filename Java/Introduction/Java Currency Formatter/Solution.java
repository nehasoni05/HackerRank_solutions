/*
Input Format
A single double-precision number denoting payment.

Sample Input
12324.134

Sample Output
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €


SOLUTION->
*/

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat usFormat=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat inFormat=NumberFormat.getCurrencyInstance(new Locale("en","in"));
        NumberFormat chFormat=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frFormat=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String us=usFormat.format(payment);
        String india=inFormat.format(payment);
        String china=chFormat.format(payment);
        String france=frFormat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
