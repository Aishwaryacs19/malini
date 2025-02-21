//program to test autoboxing and unboxing
class testautobox
{
 public static void main(String args[])
 {
  int x=10;
  long y=20;
  float a=30.5f;
  double b=77.77d;

    
  Integer objx=x;
  Long objy=y;
  Float obja=a;
  Double objb=b;
  System.out.println("converted object integer is:"+objx);
  System.out.println("converted object long is:"+objy);
  System.out.println("converted object float is:"+obja);
  System.out.println("converted object double is:"+objb);
  Short objl=10;
  Character objch='a';
  Boolean objm=true;
  Double objn=100.11;
  short l=objl;
  char ch=objch;
  boolean m=objm;
  double n=objn;
  System.out.println("converted object shorts is:"+l);
  System.out.println("converted object char is:"+ch);
  System.out.println("converted object boolean is:"+m);
  System.out.println("converted object double is:"+n);
 }
}