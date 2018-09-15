import java.util.*;
class Factorial1
{
public static void main(String... args)
{
int n;
int f=1;
Scanner scan=new Scanner(System.in);
System.out.println("enter length");
n=scan.nextInt();
for(int i=1;i<=n;i++)
{
f=f*i;
System.out.println("factorial of given number is :"+f);
}
}}