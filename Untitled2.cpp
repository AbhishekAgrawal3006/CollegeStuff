#include <stdio.h>
#include <stdlib.h>
struct node{
	int data;
	struct node *next;
}*first=NULL;
void create(int A[],int n)
{
	int i=0; 
	struct node *p=(struct node*)malloc(sizeof(struct node));
	first=p;
	first->data=A[0];
	struct node *last=first;
	for(i=1;i<n;i++)
	{
		p=(struct node*)malloc(sizeof(struct node));
		last->next=p;
		p->next=NULL;
		p->data=A[i];
		last=p;
	}
}
void display(struct node *head)
{
	struct node *p;
	p=head;
	while(p->next!=NULL)
	{
		printf("%d ",p->data);
		p=p->next;
	}
}
int main()
{
	int a[]={0,1,2,3,4};
	create(a,5);
	display(first);
	
}
