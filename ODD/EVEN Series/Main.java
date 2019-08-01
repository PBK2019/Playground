#include<stdio.h>
int main()
{
	//type your code here
  int n;
  int i=3,s=0,s1=0;
  scanf("%d",&n);
  if(n==1)
  {
    printf("0");
  }
  else if(n==2)
  {
    printf("0");
  }
  else
  {
    for(i=3;i<=n;i++)
    {
      if(i%2==1)
      {
        s=s+2;
       // printf("%d",s);
      }
      else
      {
        s1=s1+1;
       // printf("%d",s1);
      }
    }
    if(n%2==1)
    {
       printf("%d",s);
    }
    else
      {
        printf("%d",s1);
      }
  }
	
}