/*
Task

Declare a constant variable, PI, and assign it the value Math.PI. You will not pass this challenge unless the variable is declared as a constant and named PI (uppercase).
Read a number, r, denoting the radius of a circle from stdin.
Use PI and r to calculate the area and perimeter of a circle having radius .
Print area as the first line of output and print perimeter  as the second line of output.

Sample Input 0
2.6

Sample Output 0
21.237166338267002
16.336281798666924
*/

'use strict';
function main() {
    // Write your code here. Read input using 'readLine()' and print output using 'console.log()'.
    let radius = parseFloat(readLine())
    const pi=Math.PI;
    // Print the area of the circle:
    console.log(pi*radius*radius);
    // Print the perimeter of the circle:
    console.log(2*pi*radius);
    
    try {    
        // Attempt to redefine the value of constant variable PI
        PI = 0;
        // Attempt to print the value of PI
        console.log(PI);
    } catch(error) {
        console.error("You correctly declared 'PI' as a constant.");
    }
}
