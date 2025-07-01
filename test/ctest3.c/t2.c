/*
Write a program in C to find the square of any number using the function.

-> create int main() function.
-> create int square(int n) function.
-> in main function read one number and call square(int n) function. here square(int n) function will perform the operation and will return the square of given number as result to the main function.
-> in main function catch the square of number which is calculate and return by square(int n) fuction and print it.
*/


#include<stdio.h>
#include<conio.h>

int square(int n)
{
    return  n*n;

}

int main()
{
    int n,sq;
    printf("Enter a number: ");
    scanf("%d",&n);

    sq= square(n);

    printf("square:  %d",sq);

    return 0;
}