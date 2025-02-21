/*c program to calculate simple intrest*/
#include<stdio.h>

int main()
{
  float amount,rate,time,si;

  printf("Enter principal (amount):");
  scan("%f",$amount:");

  printf("enter rate:");
  scanf("%f",&rate);

  printf("enter time(in year):");
  scanf("%f",&time);

  si=(amount*rate*time)/100;

  printf("/nSimple intrest is=%f",si);

  return 0;
}
