import  java.io.*;
import java.util.*;
class array1
{
public static void main(String args [])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter how many numbers in array: ");
int n=s.nextInt();
int i;
int a[]=new int[n];
System.out.println("Enter the elements: ");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
min(a);
}
public static void min(int a[])
{
int min=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]<min)
min=a[i];
}
System.out.println("min value in array is"+min);
}
}