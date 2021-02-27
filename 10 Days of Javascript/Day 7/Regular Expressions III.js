/*
Task
Complete the function in the editor below by returning a RegExp object,re, that matches every integer in some string s.

Sample Input 0
102, 1948948 and 1.3 and 4.5

Sample Output 0
102
1948948
1
3
4
5
*/

'use strict';...

function regexVar() {
    var re = RegExp('\\d+', 'g');
    return re;
}


function main() {
    const re = regexVar();
    const s = readLine();
    
    const r = s.match(re);
    
    for (const e of r) {
        console.log(e);
    }
}
