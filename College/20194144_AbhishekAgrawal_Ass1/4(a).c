#include<stdio.h>
int main()
{
    printf("Enter the number ");
    int n=0;
    scanf("%d",&n);
    int f=factorial(n);
    printf("%d",f);
} 
int factorial(n)
{
    if(n==1)
    {
        return 1;
    }
    int fact=n*factorial(n-1);
    return fact;
}