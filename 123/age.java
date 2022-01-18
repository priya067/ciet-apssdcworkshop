import java.io.*;
import java.util.*;
class age
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter your age:");
int a=s.nextInt();
if(a>=18)
System.out.println("eligible");
else
System.out.println("not eligible");
}
}