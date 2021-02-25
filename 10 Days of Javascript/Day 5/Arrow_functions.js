/*
Task

Complete the function in the editor. It has one parameter: an array, nums. It must iterate through the array performing one of the following actions on each element:
If the element is even, multiply the element by 2.
If the element is odd, multiply the element by 3.
The function must then return the modified array.

Sample Input 0
5
1 2 3 4 5

Sample Output 0
3 4 9 8 15
*/

'use strict';...
function modifyArray(nums)
{
    const modifiedArray=nums.map(function(num){
        if(num%2==0)
        return 2*num;
        else
        return 3*num;
    });
    return modifiedArray;
    
}


function main() {
    const n = +(readLine());
    const a = readLine().split(' ').map(Number);
    
    console.log(modifyArray(a).toString().split(',').join(' '));
}
