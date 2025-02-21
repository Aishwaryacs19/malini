
class student
{
   int rollno;
    String name;
   int sem;
void getStudent(int r ,String n,int s)
  {
   rollno=r;
   name=n;
   sem=s;
   }
   void display()
   {
     System.out.println("rollno="+rollno);
     System.out.println("name="+name);
     System.out.println("sem="+sem);
    }
}
class prgmstudent
{
 public static void main(String args[])
 {
   student s1=new student();
   student s2=new student();
   s1.getStudent(1,"anirudh",4);
   s2.getStudent(2,"bharath",4);
   s1.display();
   s2.display();
  }
}
     
     