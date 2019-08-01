#include<stdio.h>
#include <math.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int sum=0,n1,i=0;
  while(n>0)
  {
    n1=n%10;
    n=n/10;
    sum=sum+(n1*(pow(2,i)));
    i++;
  }
  printf("%o",sum);
}