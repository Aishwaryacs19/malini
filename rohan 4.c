#include<stdio.h>

int main() {
  float radius, area;

  printf("\nenter the radius of circle : ");
  scanf("%f", &radius);

  area=3.14*radius*radius;
  printf("\narea of circle:%f",area);

  return (0);
}
