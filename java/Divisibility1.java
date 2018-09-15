import java.util.*;

class Divisibility1
{
public static void main(String args[])
{
int c=0;

Scanner scan=new Scanner(System.in);
System.out.println("input numbers from 1 to 100 divisible by 2,3,5 ");
int n=scan.nextInt();
for(n=2;n<=50;n++)
{
if(n%2==0||n%3==0||n%5==0)
{
System.out.println("\t"+n);
c++;
}
System.out.println("total no:"+c);
}
}
}