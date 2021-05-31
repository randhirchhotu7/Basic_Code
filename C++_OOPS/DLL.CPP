#include<iostream.h>
#include<conio.h>
#include<alloc.h>
struct dll
{
	int info;
	dll *prev;
	dll *next;
};
dll *create(dll*);
void display(dll *);
dll *insBeg(dll*, dll*);
void insmid(dll*,int p,dll*);
void insLast(dll*, dll*);

dll *delBeg(dll*);
int delmid(dll*,int p);
int delLast(dll*);

void main()
{
	dll *start=0, *node;
	clrscr();
	start=create(start);
	display(start);
	int choice;

	do
	{
		clrscr();
		cout<<"\ndll operation...\n";
		cout<<"\n\t1. insBeg.";
		cout<<"\n\t2. insmid.";
		cout<<"\n\t3. insLast";
		cout<<"\n\t4. delBeg";
		cout<<"\n\t5. del Mid";
		cout<<"\n\t6. del last";
		cout<<"\n\t7.Display";
		cout<<"\n\t8. Exit";
		cout<<"\nENter your choice: ";
		cin>>choice;
		switch(choice)
		{
			case 1: node=new dll();
				cout<<"\nEnter a number:";cin>>node->info;
				node->next=0;
				start=insBeg(start,node);
				break;
			case 2:
				node=new dll();
				cout<<"\nEnter a number:";cin>>node->info;
				node->next=0;
				int p;
				cout<<"\nEnter position: ";
				cin>>p;
				insmid(start,p,node);
				break;

			case 3:
				node=new dll();
				cout<<"\nEnter a number:";cin>>node->info;
				node->next=0;
				insLast(start,node);
				break;
			case 4:
				start=delBeg(start);
				break;
			case 5:
				cout<<"\nEnter position: ";
				cin>>p;
				 int n=delmid(start,p);
				cout<<"\nDeleted node is "<<n;
				getch();
				break;
			case 6:
				 n=delLast(start);
				cout<<"\nDelete node "<<n;
				getch();
				break;
			case 7:
				display(start);
				break;
			case 8:
				break;
			default:
				cout<<"\nInvalid choice";
		}

	   }while(choice!=8);

	getch();
}
dll* create (dll* start)
{
	int n;
	dll*node;
	while(1)
	{
		cout<<"\nEnter a number: ";
		cin>>n;
		if(n==0)break;
		else
		{
		       if(start==0)
		       {
			node=new dll();
			node->info=n;
			node->next=0;
			node->prev=0;
			start=node;
		       }
		       else
		       {
			       node->next=  new dll();
			       node->next->prev=node;
			       node=node->next;
			       node->info=n;
			       node->next=NULL;
		       }
		}
	}

	return start;
}
void display(dll* start)
{
	if(start==0)
	{
		cout<<"NO ELEMENT INSERTED . ";
	}
	else
	{
		for(dll *node=start; node;node=node->next)
		cout<<node->info<<" ";
		getch();
	}
}
dll *insBeg(dll *start, dll *ins)
{
	if(start==0)
	start=ins;
	else
	{
	ins->next=start;
	start->prev=ins;
	start=ins;
	}
	return start;
}

void  insmid(dll *start, int p, dll* ins)
{
	dll *node=start;

	for(int i=1; i<p-1; i++,node = node ->next);
	ins->next=node->next;
	node->next->prev=ins;
	node->next=ins;
	ins->prev=node;
}
void insLast(dll *start, dll* ins)
{
	for (dll* node=start;node->next;node=node->next);
	node->next=ins;
	ins->prev=node;
}
dll* delBeg(dll *start)
{
	dll * node=start;
	start=start->next;
	start->prev=0;
	cout<<"\nDelete node is "<<node->info;
	getch();
	free(node);

	return start;
}
int delmid(dll *start, int p)
{
	dll * node=start,*t;
	int n;
	for(int i=1;i<p-1;i++)
	node=node->next;

	t=node->next;
	node->next=node->next->next;
	node->next->next->prev=node;

	n=t->info;
	free (t);
	return n;
}
int delLast(dll *start)
{
	for(dll *node=start;node->next->next;node=node->next);
	dll* t=node->next;
	int n=t->info;

	node->next=0;
	node->prev=node;
	free(t);
	return n;
}