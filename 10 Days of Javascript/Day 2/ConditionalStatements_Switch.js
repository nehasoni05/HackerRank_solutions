/*
Complete the getLetter(s) function in the editor. It has one parameter: a string, , consisting of lowercase English alphabetic letters (i.e., a through z). It must return A, B, C, or D depending on the following criteria:

If the first character in string  is in the set {'a','e','o','i','u'}, then return A.
If the first character in string  is in the set {'b' , 'c' , 'd' , 'f' , 'g'}, then return B.
If the first character in string  is in the set {'h' , 'j' , 'k' , 'l' , 'm'} , then return C.
If the first character in string  is in the set {'z' , 'n' , 'p' , 'q' , 'r' , 's' , 't' , 'v' , 'w' , 'x' , 'y'}, then return D.

Sample Input 0
adfgt

Sample Output 0
A
*/

'use strict';...

function getLetter(s) {
    let letter;
    // Write your code here
    var c=s.charAt(0);
    switch(c)
    {
        case ( 'a' || 'e' || 'o' || 'i' || 'u'):
            letter='A';
            break;
        case ('b' || 'c' || 'd' || 'f' || 'g'):
            letter='B';
            break;
        case ('h' || 'j' || 'k' || 'l' || 'm'):
            letter='C';
            break;
        case ('z' || 'n' || 'p' || 'q' || 'r' || 's' || 't' || 'v' || 'w' || 'x' || 'y' ):
            letter='D';
            break;         
    }
    return letter;
}

function main() {
    const s = readLine();
    
    console.log(getLetter(s));
}
