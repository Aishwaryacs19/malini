//test method overloading
class testoverload
 {
   public static void main(String args[])
  {
    int a=10,b=20,c=30,result1,result2;
    double x=50.5,y=100.5,result3;
    result1=sum(a,b);
    System.out.println("sum of 2 integers is="+sum(a,b));
    result2=sum(a,b,c);
    System.out.println("sum of 3 integers is="+result2);
    result3=sum(x,y);
    System.out.println("sum of 2 double is="+sum(x,y));
  }
    static int sum(int a,int b)
   {
    return(a+b);
   }
    static int sum(int a,int b,int c)
   {
    return(a+b+c);
   }
    static double sum(double a,double b)
   {
    return(a+b);
   }
}
