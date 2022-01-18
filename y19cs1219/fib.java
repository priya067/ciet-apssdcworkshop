import java.io.*;
import java.util.*;
class fib
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a value:");
int n=s.nextInt();
int a=0,b=1,c,count=n;
System.out.print(a+" "+b);
for(int i=2;i<count;++i)
{
c=a+b;
System.out.print(" "+c);
a=b;
b=c;
}
}
}