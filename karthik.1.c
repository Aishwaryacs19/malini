#include <stdio.h>
int main()
{
float amount,rate,time,si;
printf("enter pricipal (amount):");
scanf("%f,&amount);
printf("enter rate:");
scanf("%f",&rate);
printf("enter time (in years):");
scanf("%f",&time);
si=(amount*rate*time)/100;
printf("\nsimple interest is =%f",si);
reurn 0;
}
