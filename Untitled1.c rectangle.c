#include<stdio.h>

int main()
{
float lenght,breadth;
float area;


printf(" Enter the lenght of a rectangle : ");
scanf("%f",&lenght);

printf("\n Enter the breadth of a rectangle :");
scanf("%f",&breadth);

area=lenght*breadth;

printf("\n Area of rectangle is: %f",area);
return 0;
}
