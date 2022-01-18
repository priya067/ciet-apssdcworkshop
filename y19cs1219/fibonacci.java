import java.io.*;
import java.util.*;
class fibonacci
{
static int a=0,b=1,c;
static void printfib(int count)
{
if(count>0)
{
c=a+b;
a=b;
b=c;
System.out.print(" "+c);
printfib(count-1);
}
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number:");
int n=s.nextInt();
int count=n;
System.out.print(a+" "+b);
printfib(count-2);
}
}
