#include <stdio.h>

double cube (double num);
int main()
{
int num;
double c;
printf("enter any number:");
scanf("%d",&num);
c = cube(num);
printf("cube of %d is %.2f",num, c);
return 0;
}
