/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

struct LinkedList
{
    int data;
    struct node *next;
};

typedef struct LinkedList *node;
node createlist(int n)
{
    int i=0;
    node temp; node head,p;
    for(i=0;i<n;i++)
    {
        if(p!=null)
        {
            p->next=temp;
        }
        temp=(node)malloc(sizeof(struct LinkedList));
        if(i==0)
        {
            head=temp;
        }
        printf("Input data for node %d",i);
        int d1=0;
        scanf("%d",&d1);
        temp->data=d1;
        p=temp;
        
    }
    return head;
}
void addend(int d,node h)
{
    node p=h;
    while(p!=NULL)
    {
        p=p->next;
    }
    p->next=(node)malloc(sizeof(struct LinkedList));
    p->next->data=d;
}
node addbeg(node h, int d)
{
    node p=(node)malloc(sizeof(struct LinkedList));
    p->next=h;
    p->data=d;
    return p;
}
void addbef(node x, node h, int d)
{
    node p=h;
    while(p->next!=x)
    {
        p=p->next;
    }
    node temp1=(node)malloc(sizeof(struct LinkedList));
    p->next=temp1;
    p=p->next;
    p->data=d;
    p->next=x;
}
void addafter(node x, node h, int d)
{
    node p=h;
    while(p!=x)
    {
        p=p->next;
    }
    node temp=p->next;
    p->next=(node)malloc(sizeof(struct LinkedList));
    p=p->next;
    p->data=d;
    p->next=temp;
}
node delfirst(node h)
{
    node newh=h->next;
    free(h);
    return newh;
}
void dellast(node h)
{
    node p=h;
    while(p->next->next!=NULL)
    {
        p=p->next;
    }
    free(p->next);
}
