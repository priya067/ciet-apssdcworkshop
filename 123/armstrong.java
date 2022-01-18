import java.io.*;
import java.util.*;
public class armstrong
{
public static void main(String args[])
{
int n,k,rem,i=0;
double a=0,arm=0;
Scanner s=new Scanner(System.in);
System.out.print("enter a number:");
n=s.nextInt();
k=n;
while(n!=0)
{
n=n/10;
i++;
n=k;
while(n!=0)
{
rem=n%10;
a=Math.pow(rem,i);
arm=arm+a;
n=n/10;
}
if(k==arm)
System.out.print("the given number is armstrong");
else
System.out.print("the given number is not armstrong");
}
}
}
