#include<stdio.h>
#include<math.h>
int main()
{
 int s,a,b,c,area;
 printf("enter the values of a&b&c\n");
 scanf("%d%d%d",&a,&b,&c);
 s=(a+b+c)/2;
 area=sqrt(s*(s-a)*(s-b)*(s-c));
 printf("area of tringuler is:%d\n",area);

 }
