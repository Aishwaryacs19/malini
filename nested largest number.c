#include<stdio.h>

int main()
{
  int a,b,c;
  printf("enter three numbers:");
  scanf("%d %d %d",&a,&b,&c);

  if(a>=b&&b>=c)
      printf("%d id the largest number.",a);

    else if (b>=a&&b>=c)

      printf("%d id the largest number.",b);

    else
      printf("%d id the largest number.",c);

    return 0;
}

