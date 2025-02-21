//programme to test the constructor
class distance
{
 int meter;
 int cm;
  distance() //default constructor 
{
 meter=0;
 cm=0;
}
distance(int m,int c) //parameterized constructor
{
 meter=m;
 cm=c;
}
 distance(distance d1) //copy constructor
{ 
 meter=d1.meter;
 cm=d1.cm;
}
void getDistance(int m,int c)
{
 meter=m;
 cm=c;
}
void display()
{
 System.out.println("distance stored in object is");
 System.out.println("meter="+meter);
 System.out.println("cm="+cm);
 }
}
class prgmdistance
{
 public static void main(String args[])
 {
  distance d1=new distance();
  distance d2=new distance(10,20);
  distance d3=new distance(d2);
  distance d4=new distance();
  d4.getDistance(30,40);
  d1.display();
  d2.display();
  d3.display();
  d4.display();
  }
}


