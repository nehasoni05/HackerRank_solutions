/*
Task
Complete the getSecondLargest function in the editor below. It has one parameter: an array,nums, of n numbers. The function must find and return the second largest number in nums.

Sample Input 0
5
2 3 6 6 5

Sample Output 0
5
*/


use strict';...

function getSecondLargest(nums) 
{
    // Complete the function
    var uniqueNums = [...new Set(nums)];   //Remove duplicates from an array using a Set
    uniqueNums.sort(function(a, b){return a - b});
   // console.log(uniqueNums);
    return uniqueNums[uniqueNums.length-2];
}


function main() {
    const n = +(readLine());
    const nums = readLine().split(' ').map(Number);
    
    console.log(getSecondLargest(nums));
}
