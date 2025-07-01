/*
Write a C program to swap first and last character of given String.
*/

#include <stdio.h>
#include <string.h>

int main()
{

    char s[100],t;
    int i, n;

    printf("Enter a string: ");
    gets(s);

    for (i = 0; s[i]; i++)
        ;
    n = i;

    t=s[0];

    s[0]=s[n-1];
    s[n-1]=t;

    printf("\n%s",s);

    return 0;
}