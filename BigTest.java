
import java.util.*;
class BigTest
{
public static void main(String args[])
{
int a,b,c,big=0;

Scanner scan=new Scanner(System.in);
System.out.println("Enter the value of a");
 a=scan.nextInt();
System.out.println("Enter the value of b");
 b=scan.nextInt();
System.out.println("Enter the value of c");
c=scan.nextInt();
if(a>big)
big=a;
if(b>big)
big=b;
if(c>big)
big=c;
System.out.println("the bggest value is :"+big);
}
}
