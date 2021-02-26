/*
We define S to be a sequence of distinct sequential integers from 1  to n; in other words, S = {1, 2, 3, ..., n}. We want to know the maximum bitwise AND value of any two integers,
a and b (where a < b), in sequence S that is also less than a given integer, k.

Sample Input 0
3
5 2
8 5
2 2

Sample Output 0
1
4
0

*/

'use strict';...

function readLine() {
    return inputString[currentLine++];
}
function getMaxLessThanK(n,k)
{
    let maximum = 0;
    let current = -1;
    for (let i = 1; i < n; i++) 
    {
        for (let j = i + 1; j <= n; j++) 
        {
            current = i & j;
            if (current < k && current > maximum) 
            {
                maximum = current;
            }
        }
    }
    return maximum;
}

function main() {
    const q = +(readLine());
    
    for (let i = 0; i < q; i++) {
        const [n, k] = readLine().split(' ').map(Number);
        
        console.log(getMaxLessThanK(n, k));
    }
}
