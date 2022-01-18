import java.io.*;
import java.util.*;
class prime 
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a value:");
int n=s.nextInt();
int i,j,r;
for(i=1;i<=n;i++)
{
r=0;
for(j=2;j<=i/2;j++)
{
if(i%j==0)
{
r=1;
break;
}
}
if(r==0)
System.out.println(i);
}
}
}