#include<stdio.h>
int main()
{
	int n,i;
  double sum=1;
    scanf("%d",&n);
    for(i=1;i<=n;i++){
      sum=sum*i;
    }
  printf("%f",sum);
}