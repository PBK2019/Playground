#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int i,a=0,b=1,c;
  if(n==1)
  {
    printf("0");
  }
  else if(n==2)
  {
    printf("1");
  }
  else
  {
    printf("0 1 ");
    for(i=3;i<=n;i++)
    {
      c=a+b;
      a=b;
      b=c;
      printf("%d ",b);
    }
  }
  return 0;
}