package Week1.Day4.Polymorphism;

/*
 * Polymorphism is : to use one thing in many forms
 * Method Overloading -> method signature will remain same, except number of arguments
 * public void shape(String shapeName,int length)
 * public void shape(String shapeName,double length)
 * public void shape(String shapeName,int length,int radius)
 */

 class Area{
    public void shapeArea(int length){//to calculate area of square
            System.out.println("Square area : "+length*length);
    }
    public void shapeArea(double radius){//to calculate area of circle
            System.out.println("Circle area : "+(3.14*radius*radius));
    }
 }

public class PolymorphismExample {
    
    public static void main(String[] args) {
        Area a=new Area();
        a.shapeArea(10);//Square
        a.shapeArea(10.0);//Circle
    }
}
