/*
Write a program in C to find the sum of the principal diagonal of a matrix.

*/

#include <stdio.h>
#include <conio.h>

int main()
{
    int a[10][10], r, c, n, m, sum = 0;

    printf("Input the size of the square matrix : ");
    scanf("%d", &n);

    printf("\nInput elements the matrix: \n");
    for (r = 0; r < n; r++)
    {
        for (c = 0; c < n; c++)
        {
            printf("element - [%d],[%d] : ", r, c);
            scanf("%d", &a[r][c]);
        }
    }

    printf("\nThe matrix is: \n");
    for (r = 0; r < n; r++)
    {
        for (c = 0; c < n; c++)
        {
            printf("%d  ", a[r][c]);
        }
        printf("\n");
    }

    printf("Addition of the principal Diagonal elements is : \n");
    for (r = 0; r < n; r++)
    {
        for (c = 0; c < n; c++)
        {
            if (r == c)
                sum += a[r][c];
        }
    }
    printf("%d  ", sum);

    return 0;
}