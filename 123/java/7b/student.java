import java.io.*;
import java.util.*;
class student
{
int regno;
String name,email;
student(int i,String n,String e)
{
  regno=i;
name=n;
email=e;
}
void display()
{
System.out.println(regno+" "+name+" "+email);
}
public static void  main(String args[])
{
 student s=new student(1218,"Niha","chavaniharika1234@gmail.com");
 student s1=new student(1219,"vasu","chebroluvasanthi2002@gmail.com");
 student s2=new student(1215,"suma","sumabogasamudram@gmail.com");
 student s3=new student(1226,"Triveni","trivenichirumamilla22@gmail.com");
 student s4=new student(1211,"susu","susmithabhumireddy@gmail.com");
s.display();
s1.display();
s2.display();
s3.display();
s4.display();
}
}
