
#include<stdio.h>

int main()
{
  float amount,rate,time,si;

  printf("Enter principal (amount):");
  scanf("%f",&amount);

  printf("enter rate:");
  scanf("%f",&rate);

  printf("enter time(in year):");
  scanf("%f",&time);

  si=(amount*rate*time)/100;

  printf("/nsimple intrest is=%f",si);

  return 0;
}
