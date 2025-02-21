//programme to test encapsulation
class empployee
{
 private int ssn;
 private String empName;
 private int Age;
 void setSSN(int ssn)
{
 this.ssn=ssn;
}
 void setEmpname(String empname)
{
 this.empName=Name;
}
 void setEmppage(int Age)
{
 this.empAge=Age;
}
 int getSSN();
{
 return(ssn)
}
 String getEmpname()
{
 return(empName);
}
 int getAge()
{
 return(empAge);
 }
}
class prgmemp
{
 public static void main(String args[])
{
 employee e1=new employee();
 e1.setSSN(100);
 e1.setEmpname("Ashu");
 e1.setAge(20);
 System.out.println("SSN of the employee is"+e1.getSSN();
 System.out.println("name of the employee is"+e1.getname();
 System.out.println("age of the employee is"+e1.getage();
 }
}
 
 