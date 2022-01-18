import  java.io.*;
import java.util.*;
class anonymous
{
public static void main (String args[])
{
min (new int [] {10,8,7,5,6,9});
}
public static void min(int a[] )
{
int min =a[0];
for (int i=0;i<a.length;i++)
{
if(a[i]<min)
min=a[i];
}
System.out.println("min value in array is:"+min);
}
}                                                                                                                                                                                                             