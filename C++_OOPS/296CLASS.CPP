//	class to represent bank acount

#include<iostream.h>
#include<conio.h>
class bank
{
	char  name[25];
	int   Accno;
	char  Acctyp[30];
	float Accbal;
	void initial(float);
	void initial(float,int);

	public:
	void getdata();

	void display()
	{
		cout<<"\n"<<"NAME : "<<name;
		cout<<"\n"<<"ACCOUNT NUMBER : "<<Accno;
		cout<<"\n"<<"ACCOUNT BALANCE : "<<Accbal;
	}

       void deposit();
       void WithdraW();
};

void bank :: initial(float f)
{
       Accbal=f;
}

void bank :: initial(float f,int n)
{
	Accbal=f-n;
}

void bank::getdata()
{
	cout<<"ENTER NAME OF DEPOSITER :"; cin>>name;
	cout<<"\n"<<"ENTER ACCOUNT NUMBER : "; cin>>Accno;
	cout<<"\n"<<"ENTER ACCOUNT TYPE : ";cin>>Acctyp;
	float f=0.00;
	initial(f);
}

void bank :: deposit()
{
	int num;
	cout<<"\n"<<"\n"<<"ENTER AMMOUNT TO DEPOSIT : "; cin>>num;
	initial(num);
}

void bank::WithdraW()
{
	int n,f;
	cout<<"\n"<<"ENTER AMOUNT TO WITHDRAW : ";cin>>n;
	initial(f);
	initial(f,n);
}

void main()
{
	bank x;
	clrscr();
	x.getdata();
	x.display();
	int rp;
	do
	{
		//	int rp;
		cout<<"\n"<<"\n"<<"DO YOU WANT TO CONTINUE .";
		cout<<"\n"<<"\t"<<" 1. DEPOSIT MONEY";
		cout<<"\n"<<"\t"<<" 2. WITHDRAW MONEY";
		cout<<"\n"<<"\t"<<" 3. EXIT";
		cout<<"\n"<<"\n"<<"\t"<<" ENTER YOUR CHOICE : ";
		cin>>rp;
		switch(rp)
		{
			case 1:
				x.deposit();
				x.display();
				break;
			case 2:
				x.WithdraW();
				x.display();
				break;
			case 3:
				break;
			default:
				cout<<"\n"<<"\n"<<"INVALID CHOICEC.";
		}
	}while(rp!=3);
getch();
}