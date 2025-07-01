
#include<stdio.h>
int isPalindrome(char s[])
{
	int i,j,f=1;
	for(i=0;s[i];i++);
	for(j=0;j<i/2;j++)
	{
		if(s[j]!=s[i-j-1])f=0;
	}
	return f;
}
int main()
{
	char s[100];
	int i;
	printf("enter a string ");
	gets(s);
	printf("%s",isPalindrome(s)?"The string is a palindrome.":"The string is not palindrome.");
}
