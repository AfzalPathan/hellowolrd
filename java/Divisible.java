import java.util.*;

class Divisible
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("input the number to check divisibilty");
int n=scan.nextInt();
if(n%11==0)
System.out.println("yes");
else 
System.out.println("no");
}
}