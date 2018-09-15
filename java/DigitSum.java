import java.util.*;

class DigitSum
{
public static void main(String args[])
{
int a,b,c,d;

Scanner scan=new Scanner(System.in);
System.out.println("input number");
a=scan.nextInt();
b=a/10;
c=a%10;
d=b+c;
System.out.println("numbers sum is:"+d);
}

}