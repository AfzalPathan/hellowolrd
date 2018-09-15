abstract class Bike
{
Bike()
{
System.out.println("bike is ready to run");
}
abstract void run();
void gear()
{
System.out.println("gear of bike willbe changed");
}
}
class Honda extends Bike
{
public void run()
{
System.out.println("Running better even dangerous issue");
}
}
class Abstract 
{
public static void main(String args[])
{
Bike b=new Honda();
b.gear();
b.run();
}
}