/*
Task

Create a Polygon class that has the following properties:
A constructor that takes an array of integer values describing the lengths of the polygon's sides.
A perimeter() method that returns the polygon's perimeter.
Locked code in the editor tests the Polygon constructor and the perimeter method.

*/

class Polygon
{
constructor(array) 
    {
        var perimeter = 0;
        for (var i in array)
            {
                perimeter += array[i];
            }
        
        this.polygon_perimeter =perimeter;
    }
    
     perimeter() 
    {
        return this.polygon_perimeter;
    }
}
