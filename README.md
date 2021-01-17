So Shivam had just learned about OOP. He had written a program before that did two things,
- Find distance between two points
- Find direction (angle) between two points in Radians.

He has this code in the `org.procedural.DistanceAndDirectionCalculator` It looks like this for the reference - 

```java
public class DistanceAndDirectionCalculator {
    public static double distance(double x1, double y1, double x2, double y2) {
        double xDistance = x1 - x2;
        double yDistance = y1 - y2;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(double x1, double y1, double x2, double y2) {
        double xDistance = x2 - x1;
        double yDistance = y2 - y1;
        return Math.atan2(yDistance, xDistance);
    }
}
```
He thought it'll be a good idea to convert this to Object Oriented Programming. So he wrote a new implementation in package `org.oop`, he got 2 classes - 
- `org.oop.DistanceAndDirectionCalculator`
- `org.oop.Point`

However, his trainer told him that what he did is not Object Oriented programming and asked Shivam to try again. 
- Try to articulate problems with Shivam's OOP solution. (Write it somewhere and share it with your trainer)
- Fork the project and fix the design related problem with Shivam's OOP solution. Share that with your trainer too.

Problem in Shivam's Solution:
 - Point class lacks behaviour of its own.
 - DistanceAnsDirectionsCalculator has no properties of its own.
 - Usage of getters and setters in Point class.
 - There is no relation between method for calculating distance and direction with that of its class.
 - Encapsulation property is violating for both the classes.

My Solution:
 - Add behaviour to Point class for calculating distance and direction from a given point to itself.
 - DistanceAnsDirectionsCalculator class has no use, so that is removed.
 - Encapsulation for Point class is restored now.
 - Minimized elements by defining difference function(rather creating local variables for storing the difference).
 
