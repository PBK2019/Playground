#include<stdio.h>
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
  int n=strlen(str);
  //Type your code here
  int i;
  for(i=0;i<n;i++)
  {
    if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U')
    {
      
    }
    else
    {
     printf("%c",str[i]); 
    }
  }
  return 0;
}