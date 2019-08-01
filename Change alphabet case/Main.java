#include <stdio.h>
int main() {
	// Type your code here
  char c;
  scanf("%c",&c);
  if(c>=65 && c<=90)
  {
    c=c+32;
    printf("%c",c);
  }
  else if(c>=97 && c<=122)
  {
    c=c-32;
    printf("%c",c);
  }
	return 0;
}