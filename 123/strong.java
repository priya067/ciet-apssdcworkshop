import java.io.*;
import java.util.*;
public class strong
{
public static void main(String args[])
{
int n,i,fact,rem;
Scanner s=new Scanner(System.in);
System.out.print("enter a number:");
n=s.nextInt();
int sum=0;
int temp=n;
while(n!=0)
{
i=1;
fact=1;
rem=n%10;
while(i<=rem)
{
fact=fact*i;
i++;
}
sum=sum+fact;
n=n/10;
}
if(sum==temp)
System.out.print("the given number is strong");
else
System.out.print("the given number is not strong");
}
}

