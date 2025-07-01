/*
Write a C program to display all characters present in the prime position of a string.
*/

#include<stdio.h>
int main()
{
	char s[100];
	int i,j,f;
	printf("enter a string ");
	gets(s);
	for(i=0;s[i];i++)
	{
		for(f=0,j=1;j<=i;j++)
		{
			if(i%j==0)f++;
		}
		if(f==2)printf("%c",s[i]);
	}
}
