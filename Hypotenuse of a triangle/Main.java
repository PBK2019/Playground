#include <stdio.h>
#include<math.h>
int main()
{
	float s1,s2;
  	double result;
  	scanf("%f",&s1);
  	scanf("%f",&s2);
  	result=sqrt(s1*s1+s2*s2);
  	printf("%.2f",result);
}