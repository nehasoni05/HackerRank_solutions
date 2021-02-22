/*
Task
Implement a function named factorial that has one parameter: an integer, n . It must return the value of n! (i.e., n factorial).

Sample Input 0
4

Sample Output 0
24
*/

'use strict';
function factorial(n)
{
    var f=1,i;
    
    for(i=1;i<=n;i++)
    f*=i;
    return f;
}

function main() 
{
    const n = +(readLine());    
    console.log(factorial(n));
}
