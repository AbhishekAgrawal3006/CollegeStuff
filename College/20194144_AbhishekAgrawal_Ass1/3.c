#include<stdio.h>
int main()
{
    //Using both methods to simply add two numbers
    printf("Enter two numbers");
    int a=0; int b=0; 
    scanf("%d %d",&a,&b);
   //first
   a=a+b;
   b=a-b;
   a=a-b;
   printf("%d %d First ",a,b);
   //second
   a=a*b;
   b=a/b;
   a=a/b;
   printf("%d %d Second ",a,b);
   //third
   a=a^b;
   b=a^b;
   a=a^b;
   printf("%d %d Third ",a,b);
} 
