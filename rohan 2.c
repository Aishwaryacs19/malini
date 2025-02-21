#include<stdio.h>
#include<math.h>

main()
{
 float p,r,t,ci;
 printf("enter principle, rate amd time:");
 scanf("%f%f%f",&p,&r,&t);
 ci=p*pow((1+r/100),t);
 printf("bank loans compound interest=%f%",ci);
}

