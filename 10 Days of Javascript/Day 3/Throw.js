/*
TASK-
 * Complete the isPositive function.
 * If 'a' is positive, return "YES".
 * If 'a' is 0, throw an Error with the message "Zero Error"
 * If 'a' is negative, throw an Error with the message "Negative Error"
 
Sample Input 1
3
2
0
6

Sample Output 1
YES
Zero Error
YES
*/


'use strict';...
function isPositive(a) 
{
    if(a>0)
    return "YES";
    else if(a<0)
    throw new Error("Negative Error");
    else
    throw new Error("Zero Error"); 
    
}
function main() {
    const n = +(readLine());
    
    for (let i = 0; i < n; i++) {
        const a = +(readLine());
      
        try {
            console.log(isPositive(a));
        } catch (e) {
            console.log(e.message);
        }
    }
}

