import java.io.*;
 class C
{
  int data=10;
  void display()
   {
     System.out.println("hai");
   }
}
class D
{
  public static void main(String args[])
  {
   C a=new C();
   System.out.println("data is"+a.data);
    a.display();
  }
}