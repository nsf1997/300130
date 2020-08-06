// Quadrilateral.java
// Class Quadrilateral definition

public class Quadrilateral
{
   private Point point1; // first endpoint
   private Point point2; // second endpoint
   private Point point3; // third endpoint
   private Point point4; // fourth endpoint

   // eight-argument constructor
   public Quadrilateral(double x1, double y1, double x2, double y2,
      double x3, double y3, double x4, double y4)
   {
      //create four endpoints here
   }

   // return point1
   public Point getPoint1()
   {
      //add your code here
   }

   // return point2
   public Point getPoint2()
   {
      //add your code here
   }

   // return point3
   public Point getPoint3()
   {
      //add your code here
   }

   // return point4
   public Point getPoint4()
   {
      //add your code here
   }

   // return string representation of a Quadrilateral object
   @Override
   public String toString()
   {
      return String.format("%s:\n%s",
         "Coordinates of Quadrilateral are", getCoordinatesAsString());
   }

   // return string containing coordinates as strings
   public String getCoordinatesAsString()
   {
      return String.format(
         "%s, %s, %s, %s\n", point1, point2, point3, point4);
   }
} // end class Quadrilateral


