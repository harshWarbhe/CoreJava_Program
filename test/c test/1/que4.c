#include <stdio.h>
#include <conio.h>

int main()
{
    int n, a[100], r, c, nr, nc, i;

    printf("Enter the row size: ");
    scanf("%d", &nr);

    for (r = 1; r <= nr; r++)
    {
        for (c = 1; c <= nr; c++)
        {
            if (r == 1 || r == nr || r == nr/2 + 1 || c==1 || c== nr || c==nr/2 + 1)

                printf("* ");
            else
                printf("  ");
        }

        printf("\n");
    }

    return 0;
}