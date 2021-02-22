/*
Task
Complete the following functions in the editor below:
getArea(length, width): Calculate and return the area of a rectangle having sides length and width .
getPerimeter(length, width): Calculate and return the perimeter of a rectangle having sides length and width.

Sample Input 0
3
4.5

Sample Output 0
13.5
15
*/

'use strict';
function getArea(length, width) 
{
    let area;
    area=length*width;
    return area;
}

function getPerimeter(length, width) {
    let perimeter;
    perimeter=2*(length+width);
    return perimeter;
}


function main() {
    const length = +(readLine());
    const width = +(readLine());
    
    console.log(getArea(length, width));
    console.log(getPerimeter(length, width));
}
