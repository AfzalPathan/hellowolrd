class Address
{
private String street;
private String city;
Address(String street ,String city)
{
this.street=street;
this.city=city;
}
String getStreet()
{
return street;
}
String getCity()
{
return city;
}
}
class Person
{
private String name;
private  String add;
Person(String name,Address add)
{
this.name=name;
this.add=add;
}
void PrintPerson()
{
System.out.println(name);
System.out.println(add.getStreet());
System.out.println(add.getCity());
}
}
class AggregateTest
{
public static void main(String args[])
{
Address add1=new Address("S.R nagar","Hyd");
Address add2=new Address("Ameerpet","Hyd");
Person p1=new Person("Ramesh",add1);
Person p2=new Person("Rajesh",add2);
p1.PrintPerson();
p2.PrintPerson();
}
}