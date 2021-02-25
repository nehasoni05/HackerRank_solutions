/*
Task
The code in the editor has a tagged template literal that passes the area and perimeter of a rectangle to a tag function named sides. Recall that the first argument of a tag
function is an array of string literals from the template, and the subsequent values are the template’s respective expression values.
Complete the function in the editor so that it does the following:

Finds the initial values of s1 and s2 by plugging the area and perimeter values into the formula:

s = P+−sqrt(P*P−16*A))/4;
where A is the rectangle’s area and P is its perimeter.
Creates an array consisting of s1 and s2 and sorts it in ascending order.
Returns the sorted array.

Sample Input 0
10
14

Sample Output 0
10
14
*/

'use strict';...
function sides(literals, ...expressions) 
{
    var area=expressions[0];
    var perimeter=expressions[1];
    var result;
    var side1=(perimeter+Math.sqrt(perimeter * perimeter  - (16 * area))) / 4;
    
    var side2=(perimeter - Math.sqrt(perimeter * perimeter  - (16 * area))) / 4;
    if(side1<side2)
    result=[side1,side2];
    else
    result=[side2,side1];
    
    return result;
}

function main() {
    let s1 = +(readLine());
    let s2 = +(readLine());
    
    [s1, s2] = [s1, s2].sort();
    
    const [x, y] = sides`The area is: ${s1 * s2}.\nThe perimeter is: ${2 * (s1 + s2)}.`;
    
    console.log((s1 === x) ? s1 : -1);
    console.log((s2 === y) ? s2 : -1);
}
