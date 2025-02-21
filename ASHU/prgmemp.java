//programme to test encapsulation
class employee
{
 private int ssn;
 private String Name;
 private int Age;
 void setSSN(int ssn)
{
 this.ssn=ssn;
}
 void setName(String name)
{
 this.Name=Name;
}
 void setAge(int Age)
{
 this.Age=Age;
}
 int getSSN()
{
 return(ssn);
}
 String getName()
{
 return(Name);
}
 int getAge()
{
 return(Age);
 }
}
class prgmemp
{
 public static void main(String args[])
{
 employee e1=new employee();
 e1.setSSN(100);
 e1.setName("Ashu");
 e1.setAge(20);
 System.out.println("SSN of the employee is:"+e1.getSSN());
 System.out.println("name of the employee is:"+e1.getName());
 System.out.println("age of the employee is:"+e1.getAge());
 }
}
 
 