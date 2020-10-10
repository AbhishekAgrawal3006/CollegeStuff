#include<stdio.h>
int Binary(int A[], int start, int end, int element) {
   if(start>end) return -1;
      int mid = (start+end)/2;
   if( A[mid] == element ) return mid;
   else if( element < A[mid] )
      Binary(A, start, mid-1, element);
   else
      Binary(A, mid+1, end, element);
}
int main() {
   int A[] = {0,3,5,10,15,20,33,56,59,82};
   int n=20;
   printf("%d is found at Index %d \n",n,Binary(A,0,9,n)+1);
   return 0;
}