#include <stdio.h>
#include <conio.h>
#include <math.h>

int main()
{
    int n, i, a[100], j, ele;

    printf("Enter number: ");
    scanf("%d", &n);

    printf("enter element:  ");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }


    printf("enter the element to be deleted: ");
    scanf("%d", &ele);

    for (i = 0; i < n; i++)
    {
        if (ele == a[i])
        {
            a[i] = a[i + 1];
            n--;
        }
    }

    printf("after delection:  ");
    for (i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }

    return 0;
}
