package lab;
abstract class Shape {
    int x,y;
    abstract void printArea(double x,double y);
} 
class Rectangle extends Shape
{ 
    void printArea (double x,double y) 
      { 
          System.out.println("Area of rectangle is :"+(x*y)); 
      }
} 
class Circle extends Shape 
{ 
    void printArea (double x,double y) 
     { 
    	 System.out.println("Area of circle is :"+(3.14*x*x)); 
     }
} 
class Triangle extends Shape
{ 
    void printArea (double x,double y)
     { 
    	System.out.println("Area of triangle is :"+(0.5*x*y)); 
     } 
} 
public class AbstractDemo
{
    public static void main(String[] args)
  { 
      Rectangle r=new Rectangle(); 
      r. printArea (2,5);
      Circle c=new Circle(); 
      c. printArea (5,5); 
      Triangle t=new Triangle(); 
      t. printArea (2,5);
  }
}
