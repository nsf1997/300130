// Parallelogram.java
// Class Parallelogram definition

public class Parallelogram extends Trapezoid
{
   // constructor
   public Parallelogram(double x1, double y1, double x2, double y2,
      double x3, double y3, double x4, double y4)
   {
      // add your code here
   }

   // return width of parallelogram
   public double getWidth()
   {
      if (getPoint1().getY() == getPoint2().getY())
         return Math.abs(getPoint1().getX() - getPoint2().getX());
      else
         return Math.abs(getPoint2().getX() - getPoint3().getX());
   }

   // return string representation of Parallelogram object including coordinates, width, height and area.
   @Override
   public String toString()
   {
      //add your code here
   }
} // end class Parallelogram

