#include<stdio.h>
#include<math.h>
int main()
{
	int n,i,p,tmp,sum=0;
	printf("enter the number ");
	scanf("%d",&n);
	p = log10(n)+1;
	tmp = n;
	while(tmp!=0)
	{
		sum += (int)pow(tmp%10,p);
		p--;tmp /= 10;
	}if(sum==n)printf("%d is disarium number",n);
	else printf("%d is not disarium number",n);
}
