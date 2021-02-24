/*
Task
Complete the function in the editor. It has two parameters: and . It must return an object modeling a rectangle that has the following properties:
length : This value is equal to a.
width : This value is equal to b.
perimeter : This value is equal to 2 X (a + b)
area : This value is equal to a X b

Sample Input 0
4
5

Sample Output 0
4
5
18
20
*/

'use strict';...
function Rectangle(a, b) 
{
    var output={};
    output.length=a;
    output.width=b;
    output.perimeter=2*(a+b);
    output.area=a*b;
    return output;
}


function main() {
    const a = +(readLine());
    const b = +(readLine());
    
    const rec = new Rectangle(a, b);
    
    console.log(rec.length);
    console.log(rec.width);
    console.log(rec.perimeter);
    console.log(rec.area);
}
