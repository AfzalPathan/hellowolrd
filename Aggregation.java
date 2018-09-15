class A
{
int x=10;
}
class B
{
int y=20;
A obja;
B(A obja)
{
this.obja=obja;
}
void add()
{
int s=obja.x+y;
System.out.println(s);
}}
class Aggregation
{
public static void main(String...args)
{
A obj1=new A();
B obj2=new B(obj1);
obj2.add();
}
}


/*using contructor*/
