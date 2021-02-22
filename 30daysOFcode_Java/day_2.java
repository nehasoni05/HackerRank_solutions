/*
Task
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax)
for a meal, find and print the meal's total cost. Round the result to the nearest integer.

Sample Input
12.00
20
8

Sample Output
15
*/

import java.math.*;
import java.util.*;

public class day_2 {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) 
    {
        double tip=(meal_cost/100)*tip_percent;
        double tax=(meal_cost/100)*tax_percent;
        int total_cost=(int) Math.round(meal_cost+tax+tip);
        System.out.print(total_cost);      

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();
        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
