#include<stdio.h>
int main()
{
    printf("Enter the number ");
    int n=0;
    scanf("%d",&n);
    int k=1;
    printf("0 1 1 ");
    fibo(n,k,1,1);
} 
void fibo(int n, int k, int a, int b)
{
    if(k>n)
    {
        return;
    }
    printf("%d ",a+b);
    fibo(n,k+1,b,a+b);
}