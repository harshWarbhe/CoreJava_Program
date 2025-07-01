#include <stdio.h>
#include <conio.h>

int main()
{
    int n, a[100], r, c, nr, nc, i;

    printf("Enter the row size: ");
    scanf("%d", &nr);

    for (r = 1; r <= nr * 2 - 1; r++)
    {
        for (c = 1; c <= nr; c++)
        {
            if (c <= r && c + r <= nr * 2)
            printf("%d",c);
        }

        printf("\n");
    }

    return 0;
}