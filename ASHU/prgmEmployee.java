class Employee
{
 int empid;
 String name;
 String designation;
 int salary;
 void getEmployee(int i,String n,String d,int s)
 {
  empid=empid;
  name=name;
  designation=designation;
  salary=salary;
}
 void display()
 {
  System.out.println("empid="+empid);
  System.out.println("name="+name);
  System.out.println("designation="+designation);
  System.out.println("salary="+salary);
  }
}
class prgmEmployee
{
 public static void main(String args[])
  {
    Employee e1=new Employee();
    e1.getEmployee(101,"Ashu","Manager",80000);
    e1.display();
  }
}