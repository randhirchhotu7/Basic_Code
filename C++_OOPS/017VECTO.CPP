//	displaying vector

#include<iostream.h>
#include<conio.h>
class vector
{
	float a[100];
	public:
	void getvector();
       //	void changevector();
	void mulvector(float [],int);
	void display(float [],int);
};

void vector :: getvector()
{
	int num;
	cout<<"ENTER NUM OF ELEMENT OF VECTOR : "; cin>>num;
	cout<<"\nENTER"<<num<<"ELEMENTS : ";
	for(int i=0;i<num;i++)
	{
		cin>>a[i];
	}
    //	display(a,num);
    //	mulvector(a,num);
    //	display(a,num);
}

void vector :: display(float a[100], int num)
{
	cout<<"\n"<<"ELEMENT OF VECTORS : (";
	for(int i=0;i<num;i++)
	{
		cout << a[i]<<",";
	}
	cout<<")";
}

void vector :: mulvector(float a[100], int num)
{
	int x;
	cout<<"\n"<<"ENTER A NUMBER TO MULTIPLY : ";cin>>x;
	for(int i=0;i<num;i++)
	{
		a[i]=a[i]*x;
	}
}

void main()
{
	vector x;
	clrscr();
	x.getvector();
      //	x.mulvector();

	getch();

     /*	int rp;
	do
	{
		clrscr();
		cout<<"\n\n"<<"DO YOU WANT TO CONTINUE .";
		cout<<"\n\t"<<" 1. MODIFY VALUE OF VECTOR.";
		cout<<"\n\t 2. MULTIPLY ANY NUMBER WITH VECTOR.";
		cout<<"\n\t"<<" 3. Display";
		cout<<"\n\t4.Exit.";
		cout<<"\n\n\t"<<" ENTER YOUR CHOICE : ";
		cin>>rp;
		clrscr();
		switch(rp)
		{
			case 1:
				cout<<"\nENTER NEW VALUE OF VECTORS : ";
				break;
			case 2:
				x.mulvector(float [],int);
				break;
			case 3:

				break;
			case 4:
				break;
			default:
				cout<<"\n"<<"\n"<<"INVALID CHOICEC.";
		}
		getch();
	}while(rp!=4);    */
}