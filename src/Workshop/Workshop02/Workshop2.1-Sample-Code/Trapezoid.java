// Trapezoid.java
// Class Trapezoid definition

public class Trapezoid extends Quadrilateral
{
   private double height; // height of trapezoid

   // constructor
   public Trapezoid(double x1, double y1, double x2, double y2,
      double x3, double y3, double x4, double y4)
   {
      //add your code here
   }

   // return height
   public double getHeight()
   {
      if (getPoint1().getY() == getPoint2().getY())
         return Math.abs(getPoint2().getY() - getPoint3().getY());
      else
         return Math.abs(getPoint1().getY() - getPoint2().getY());
   }

   // return area
   public double getArea()
   {
      return getSumOfTwoSides() * getHeight() / 2.0;
   }

   // return the sum of the trapezoid's two sides
   public double getSumOfTwoSides()
   {
      if (getPoint1().getY() == getPoint2().getY())
         return Math.abs(getPoint1().getX() - getPoint2().getX()) +
            Math.abs(getPoint3().getX() - getPoint4().getX());
      else
         return Math.abs(getPoint2().getX() - getPoint3().getX()) +
            Math.abs(getPoint4().getX() - getPoint1().getX());
   }

   // return string representation of Trapezoid object includeing coordinates, height, and area
   @Override
   public String toString()
   {
     //add your code here
   }
} // end class Trapezoid

