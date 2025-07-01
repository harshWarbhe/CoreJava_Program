#include <stdio.h>
#include <conio.h>

int main()
{
    int n, a[100], r, c, nr, sp, i;
    int x,y,z,k;
    x=y=n;

    printf("Enter the row size: ");
    scanf("%d", &nr);

    for (z=1,r = 1; r <= nr; r++,z+=2)
    {
        // for (sp = 1; sp <= nr - r; sp++)
        // {
        //     printf("  ");
        // }
         
        // i = r * 2 - 1;//i=1,3,5,7,9
        // for (c = 1; c <= r * 2 - 1; c++)
        // {
            
        //     printf("%d ", i);
        //     i--;
        // }

        // printf("\n");
        k=z;
        for(c=1;c<=nr;c++)
        {
            if(c>=x && c<=y)printf("%d",k--);
            else printf(" ");
        }x--;
        y++;printf("\n");
    }

    return 0;
}