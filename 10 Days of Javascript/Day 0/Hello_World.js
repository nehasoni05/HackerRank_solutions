/*
TASK-
A greeting function is provided for you in the editor below. It has one parameter, parameterVariable. Perform the following tasks to complete this challenge.
Use console.log() to print Hello, World! on a new line in the console, which is also known as stdout or standard output. The code for this portion of the task is already provided
in the editor.
Use console.log() to print the contents of parameterVariable (i.e., the argument passed to main).

Sample Input 0
Welcome to 10 Days of JavaScript!

Sample Output 0
Hello, World!
Welcome to 10 Days of JavaScript!
*/

use strict';
function greeting(parameterVariable) 
{
    // This line prints 'Hello, World!' to the console:
    console.log('Hello, World!');
    console.log(parameterVariable);   
}

function main() {
    const parameterVariable = readLine();
    
    greeting(parameterVariable);
}
