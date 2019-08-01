#include<stdio.h>
int main()
{
  //type your code here
  int n,e=1,o=1,i;
  scanf("%d",&n);
  int arr[n];
  if(n==1)
  {
    printf("1");
  }
  else if(n==2)
  {
    printf("1");
  }
  else
  {
    for(i=3;i<=n;i++)
    {
      if(i%2==1)
      {
        e=e*2;
        arr[i]=e;
      }
      else
      {
        o=o*3;
        arr[i]=o;
      }
    }
    printf("%d",arr[i-1]);
  }
  return 0;
}