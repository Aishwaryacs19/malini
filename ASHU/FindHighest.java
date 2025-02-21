import java.util.Scanner;
class FindHighest
{ 
 public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 int marks[]=new int[10];
 int highest;
 for(int i=0;i<10;i++)
{
 System.out.println("enter the marks of student no"+(i+1));
 marks[i]=s.nextInt();
}
 highest=marks[0];
 for(int i=0;i<10;i++)
{ 
 if(marks[i]>highest)
 highest=marks[i];
}
 System.out.println("highest marks in the class is"+highest);
}
}