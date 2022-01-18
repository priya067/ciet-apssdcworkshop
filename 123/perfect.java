import java.io.*;
import java.util.*;
public class perfect
{
public static void main(String args[])
{
int n,sum=0;
Scanner s=new Scanner(System.in);
System.out.print("enter a number:");
n=s.nextInt();
for(int i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
if(sum==n)
System.out.print("the given number is perfect");
else
System.out.print("the given number is not perfect");
}
}

