import java.io.*;
import java.util.*;
public class prime
{
public static void main(String args[])
{
int i,c,n;
Scanner s=new Scanner(System.in);
System.out.print("enter a number:");
n=s.nextInt();
i=1;
c=0;
while(i<=n)
{
if(n%i==0)
c++;
i++;
}
if(c==2)
System.out.print("the given number is prime");
else
System.out.print("the given number is not prime");
}
}
