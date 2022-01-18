import java.io.*;
import java.util.*;
public class palindrome
{
public static void main(String args[])
{
int n,sum=0,temp;
Scanner s=new Scanner(System.in);
System.out.print("enter a number:");
n=s.nextInt();
temp=n;
while(n>0)
{
sum=(sum*10)+(n%10);
n=n/10;
}
if(temp==sum)
System.out.print("the given number is palindrome");
else
System.out.print("the given number is not palindrome");
}
}
