/*
Task

Complete the function in the editor below by returning a RegExp object,re , that matches any string s satisfying both of the following conditions:

String s starts with the prefix Mr., Mrs., Ms., Dr., or Er.
The remainder of string s (i.e., the rest of the string after the prefix) consists of one or more upper and/or lowercase English alphabetic letters (i.e., [a-z] and [A-Z]).

Sample Input 0
Mr.X

Sample Output 0
true
*/

'use strict';...
function regexVar() 
{
     var re = (/^(Mr\.|Dr\.|Er\.|Ms\.|Mrs\.)\s?[a-z|A-Z]+$/);
    return re;
}


function main() 
{
    const re = regexVar();
    const s = readLine();
    
    console.log(!!s.match(re));
}
