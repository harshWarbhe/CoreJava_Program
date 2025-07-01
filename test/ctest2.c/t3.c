/*

Write a C program to count the Count the vowel, Consonant, Digit and Special Character in a given String .
*/

#include <stdio.h>
#include <conio.h>

int main()
{
    char str[100], rev[100];
    int i, j, v, c, d, sp;

    printf("Enter the  string : ");
    gets(str);

    for (v = c = d = sp = i = 0; str[i]; i++)
    {
        if (str[i] >= 65 && str[i] <= 90)
            str[i] +=  32;
        if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
            v++;
        else if (str[i] >= 97 && str[i] <= 122)
            c++;
        else if (str[i] >= 48 && str[i] <= 57)
            d++;
        else
            sp++;
    }

    printf("\nVowel count is : %d \nConsonant count is : %d \nDigit count is : %d \nSpecial Character count is : %d", v, c, d, sp);

    return 0;
}