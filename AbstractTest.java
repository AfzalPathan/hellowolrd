abstract class Shape
{
abstract void draw();

}
class Rectangle extends Shape
{
public void draw()
{
System.out.println("drawing rectangle");
}
}
class Circle extends Shape
{
public void draw()
{
System.out.println("Circle");
}
}
class AbstractTest 
{
public static void main(String args[])
{
Shape s=new Circle();
s.draw();
}
}