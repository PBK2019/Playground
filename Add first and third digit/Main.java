#include<stdio.h>
int main()
{
  //Type your code here
  int a,n,r;
  scanf("%d",&a);
  n=a%10;
  r=a/100;
  printf("%d",n+r);
  return 0;
}