/*
Que 2 :  
=======

Write a program in C to find the sum of each row of a matrix.

*/

#include<stdio.h>
#include<conio.h>

int main()
{
    int a[10][10], b[10][10], r, c, n, sum=0;

    printf("Input the size of the matrix : ");
    scanf("%d",&n);

    printf("\nInput elements in the matrix: \n");
    for(r=0; r<n; r++)
    {
        for(c=0; c<n; c++)
        {
            printf("element - [%d],[%d] : ", r, c);
            scanf("%d", &a[r][c]);
        }
    }

    printf("\n\nThe matrix is:\n");
    for(r=0; r<n; r++)
    {
        for(c=0; c<n; c++)
        {
            printf("%d  ", a[r][c]);
        }
        printf("\n");
    }

    printf("\nsum of each row of a matrix.\n");
    for(r=0; r<n; r++)
    {
        for(sum=c=0; c<n; c++)
        {
            sum += a[r][c] ;
            
        }
        printf("%d  ",sum);
    }

    return 0;
}