class A
{
int x=20;
int y=30;
public String toString()
{
return x+" "+y;
}
}
class B
{
public static void main(String... args)
{
A a=new A();
System.out.println(a);
System.out.println(a.toString());
}
}


/*Program for on bject refrence variable that print either 

type or hashcode.*/ 