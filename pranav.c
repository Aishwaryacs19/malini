program

#include<stdio.h>

int main() {
   float radius, area;

   printf("\nEnter the radius of circle : ");
   scanf("%f", &radius);

   area=3.14 *radius * radius;
   printf("\naArea of circle:%f", area);

   return (0);
   }
