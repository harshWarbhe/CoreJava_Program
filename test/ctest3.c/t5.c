/*
Write a C program to find the first repeated character in a string.
*/

#include <stdio.h>

int main()
{
    char str[100];
    int i, j, c;

    printf("Enter the  string: ");
    gets(str);

    for (i = 0; str[i]; i++)
    {
        if(str[i]>='A' &&  str[i]<='Z')
        str[i] += 32;

    }

    for (i = 0; str[i]; i++)
    {
        if (c == 1)
        {
            for (j = 1; str[j]; j++)
            {
                if (str[i] == str[j] && i != j)
                    c++;               
            }
        }
    }

    printf("First repeated character is: %c\n", str[i-1]);


    return 0;
}