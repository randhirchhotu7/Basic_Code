//	class to represent bank acount

#include<iostream.h>
#include<conio.h>
class bank
{
	char  name[25];
	int   Accno;
	char  Acctyp[30];
	float Accbal;
	void initial(float,int);

	public:
	bank()   //default contructor
	{
		name[0]=0;
		Accno=0;
		Acctyp[0]=0;
		Accbal=0;
	}
	void getdata()
	{
		cout<<"\n"<<"ENTER NAME OF DEPOSITER :"; cin>>name;
		cout<<"\n"<<"ENTER ACCOUNT NUMBER : "; cin>>Accno;
		cout<<"\n"<<"ENTER ACCOUNT TYPE : ";cin>>Acctyp;
		cout<<"\nInitial amount: "; cin>>Accbal;
	}


       void deposit(int d)
       {
		Accbal+=d;
       }

       void WithdraW(int w)
       {
		if(Accbal<w)
		{
			cout<<"\nInsufficient balance";
		}
		else
		{
			Accbal-=w;
		}
       }
       void display()
       {
		cout<<"\nName: "<<name<<"\nAccount balance: "<<Accbal;
       }



};


void main()
{
	bank x;
	clrscr();
	x.getdata();

       //	x.display();

	int rp,amt=0;;
	do
	{
		clrscr();
		cout<<"\n"<<"\n"<<"DO YOU WANT TO CONTINUE .";
		cout<<"\n"<<"\t"<<" 1. DEPOSIT MONEY";
		cout<<"\n\t 2. WITHDRAW MONEY";
		cout<<"\n"<<"\t"<<" 3. Display";
		cout<<"\n\t4.Exit.";
		cout<<"\n"<<"\n"<<"\t"<<" ENTER YOUR CHOICE : ";
		cin>>rp;
		clrscr();
		switch(rp)
		{
			case 1:
				cout<<"\nEnter amount: ";
				cin>>amt;
				x.deposit(amt);
				break;
			case 2:
				cout<<"\nEnter amount: ";
				cin>>amt;
				x.WithdraW(amt);

				break;
			case 3:
				x.display();
				break;
			case 4:
				break;
			default:
				cout<<"\n"<<"\n"<<"INVALID CHOICEC.";
		}
		getch();
	}while(rp!=4);
}