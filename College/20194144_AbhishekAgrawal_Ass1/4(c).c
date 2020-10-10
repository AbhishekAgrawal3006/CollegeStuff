#include<stdio.h>
int main()
{
    printf("Enter the numbers in ascending order ");
    int a=0; int b=0;
    scanf("%d %d",&a,&b);
    gcd(a,b,1,1);
} 
void gcd(int a, int b, int c, int gc)
{
    int g=gc;
    if(c>a+1)
    {
        printf ("%d",gc);
        return gcd;
    }
    if(a%c==0 && b%c==0)
    {
        g=c;
    }
    gcd(a,b,c+1,g);
}