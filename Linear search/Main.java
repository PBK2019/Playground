#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int a[n];
  int i;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int t,c=0;
  scanf("%d",&t);
  for(i=0;i<n;i++)
  {
    if(a[i]==t)
    {
      printf("%d",i+1);
      break;
    }
    c++;
  }
  if(c!=n)
  {
    
  }
  else
  {
     printf("%d isn't present in the array.",t);
  }
  return 0;
}