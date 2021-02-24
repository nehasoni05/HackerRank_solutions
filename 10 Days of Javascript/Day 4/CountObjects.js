/*
Task
Complete the function in the editor. It has one parameter: an array, a, of objects. Each object in the array has two integer properties denoted by x and y. The function must
return a count of all such objects o in array a that satisfy o.x = o.y.

Sample Input 0
5
1 1
2 3
3 3
3 4
4 5

Sample Output 0
2
*/

'use strict';...
function getCount(objects) 
{
    var count=0;
    for(var i in objects)
    {
        if(objects[i].x===objects[i].y)
        count++;
    }
    return count;
    
}


function main() {
    const n = +(readLine());
    let objects = [];
    
    for (let i = 0; i < n; i++) {
        const [a, b] = readLine().split(' ');
        
        objects.push({x: +(a), y: +(b)});
    }
    
    console.log(getCount(objects));
}
