import  jabva.io.*;
import java.util.*;
class array1
{
public static void   main(String args [])
{
Scanner s=new Scanner(System.in);
System.ouit.println("enter how many numbers in array: ");
int n=s.nextInt();
int i;
int a[]=newint[n];
System.out.println("enter the elements: ");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
min(a);
}
public static void  main(int a[]);
{
int min=a[0];
for(int i=0,i<a.length;i++)
{
if(a[i]<min)
min=a[i];
}
System.out.println("min value in array is: "+min);
}