//test 5 function of string class
import java.lang.String;
class testString
{
public static void main(String args[])
{
String s1=new  String("Sachin");
String s2=new String("Tendulkar");
String s3=new String();
System.out.println("lenght of first string is:"+s1.length());
System.out.println("lenght of second string is:"+s2.length());
System.out.println("upercase of first string is:"+s1.toUpperCase());
System.out.println("Lowercase of second string is:"+s2.toLowerCase());
if(s1.compareTo(s2)<0)
System.out.println(first String is greater than second");
else
System.out.println("second String is greater than first");
s3=s1.concat(s2);
System.out.println("concatinated string is:"+s3);
}
}