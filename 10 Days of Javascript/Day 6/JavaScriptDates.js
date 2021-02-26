/*
Task

Given a date string, dateString , in the format MM/DD/YYYY, find and return the day name for that date. Each day name must be one of the following strings: Sunday, Monday, Tuesday, Wednesday,
Thursday, Friday, or Saturday. For example, the day name for the date 12/07/2016 is Wednesday.

Sample Input 0
2
10/11/2009
11/10/2010

Sample Output 0
Sunday
Wednesday
*/

'use strict';...
// The days of the week are: "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
function getDayName(dateString) {
    let dayName;
    // Write your code here
    const date=new Date(dateString);
    let days=["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    dayName=days[date.getDay()];
    return dayName;
}


function main() {
    const d = +(readLine());
    
    for (let i = 0; i < d; i++) {
        const date = readLine();
        
        console.log(getDayName(date));
    }
}
