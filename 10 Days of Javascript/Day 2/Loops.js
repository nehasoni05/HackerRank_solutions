/*
Task

Complete the vowelsAndConsonants function in the editor below. It has one parameter, a string, s , consisting of lowercase English alphabetic letters (i.e., a through z). The 
function must do the following:
First, print each vowel in s on a new line. The English vowels are a, e, i, o, and u, and each vowel must be printed in the same order as it appeared in s.
Second, print each consonant (i.e., non-vowel) in s on a new line in the same order as it appeared in s.

Sample Input 0
javascriptloops

Sample Output 0
a
a
i
o
o
j
v
s
c
r
p
t
l
p
s
*/


'use strict';
function vowelsAndConsonants(s) {
    var i;
    var vowels = ['a', 'e', 'i', 'o', 'u','A','E','I','O','U'];
    for(i=0;i<s.length;i++)
    {
        
        if(vowels.indexOf(s[i]) > -1)
        console.log(s[i]);
    }
    for(i=0;i<s.length;i++)
    {
        
        if(vowels.indexOf(s[i]) == -1)
        console.log(s[i]);
    }   
}
function main() {
    const s = readLine();
    
    vowelsAndConsonants(s);
}
