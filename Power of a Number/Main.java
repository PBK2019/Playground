#include <stdio.h>
int main()
{
  	int b,e,i;
  	double sum=1;
  	scanf("%d",&b);
  	scanf("%d",&e);
  	if(e<0){
      printf("Wrong input");
    }
  else{
    while(e!=0){
    	sum*=b;
    	e--;
	}
    printf("%f",sum);
  }
  return 0;
}
