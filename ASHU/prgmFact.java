//find factorial of a number
//use static method and keyboard input
import java.util.Scanner;
class prgmFact
{
 public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 int number;
 System.out.println("enter the number from the keyboard");
 number=s.nextInt();
 System.out.println("factorial of a number"+fact(number));
}
 static int fact(int n)
 {
  int f=1;
  for(int i=1;i<=n;i++)
  f=f*i;
  return(f);
 }
}