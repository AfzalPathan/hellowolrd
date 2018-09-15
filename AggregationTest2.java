class Student
{
private int rollno;
private String name;
Student(int rollno,String name)
{
this.rollno=rollno;
this.name=name;
}
int getRollNo()
{
return rollno;
}
String getName()
{
return name;
}
}
class Marks
{
private int sub1,sub2;
Marks(int sub1,int sub2)
{
this.sub1=sub1;
this.sub2=sub2;
}
void finalResult(Student s)
{
System.out.println(s.getRollNo());
System.out.println(s.getName());
if(sub1<40||sub2<40)
System.out.println("fail");
else
System.out.println("pass");
}
}
class AggregationTest2
{
public static void main(String...args)
{
Student s1=new Student(101,"sam");
Marks marks1=new Marks(70,80);
marks1.finalResult(s1);
}
}


/*Aggreagation using method*/
