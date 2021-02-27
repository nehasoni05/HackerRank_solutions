/*
Task

Complete the function in the editor below by returning a RegExp object,re , that matches any string s that begins and ends with the same vowel. Recall that the English vowels are
a, e, i, o, and u.

Sample Input 0
bcd

Sample Output 0
false

Sample Input 2
abcda

Sample Output 2
true
*/

'use strict';...
function regexVar() 
{
    var exp = RegExp(/^([aeiou]).*\1$/);
    return exp;
}


function main() {
    const re = regexVar();
    const s = readLine();
    
    console.log(re.test(s));
}
