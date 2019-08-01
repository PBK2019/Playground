#include <stdio.h>
#define pi 3.14
int main()
{
	float r,ca;
  	double result;
  	scanf("%f",&r);
  	scanf("%f",&ca);
  	result=2*pi*r*(ca/360);
  	printf("%.2f",result);
}