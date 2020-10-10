#include<stdio.h>
int main()
{
    printf("Enter the number of elements");
    int n=0;
    scanf("%d",&n);
    int i=0;
    printf("Enter the numbers ");
    int arr[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the number to be found");
    int k=0;
    scanf("%d",&k);
    int pos=-1;
    ls(arr,k,pos,0,n);
} 
void ls(int a[], int k, int pos, int i, int n)
{
    int p=pos;
    if(i==n)
    {
        if(pos==-1)
        printf("Element not found");
        else
        printf("Position of element is %d ",pos+1);
        return;
    }
    if(a[i]==k)
    {
        p=i;
    }
    ls(a,k,p,i+1,n);
    
}