//	checking armstrong or not.

#include<iostream.h>
#include<conio.h>
int CKarmstrong(int);

void main()
{
	int num,test,temp;
	clrscr();
	cout<<"ENTER A NUMBRER : ";  cin>>num;
	temp=num;
	test=CKarmstrong(num);
	if(test==temp)
		cout<<"GIVEN NUMBER "<< num <<" IS ARMSTRONG .";
	else

		cout<<"GIVEMN NUMBER "<< num <<" IS NOT ARMSTRONG .";
getch();
}
int CKarmstrong(int num)
{
	int rem,sum=0,count=0;
	while(num>0)
	{
		rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
		//count=1;
	}
	return sum;
}