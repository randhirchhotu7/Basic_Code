// 	file handling
#include<iostream.h>
#include<fstream.h>
#include<conio.h>
void main()
{
	ofstream out("file2.txt");
	char n1[30],n2[30],n3[30];
	clrscr();
	cout<<"ENTER FIRST NAME : "; cin>>n1;
	cout<<"ENTER SECOND NAME : ";cin>>n2;
	cout<<"ENTER THIRD NAME : ";cin>>n3;
	out<<endl<<n1<<endl<<n2<<endl<<n3<<endl;
	out.close();

	ofstream out1("file2.txt");
	int m1,m2,m3;
	cout<<"ENTER FIRST NUM : ";cin>>m1;
	cout<<"ENTER SECOND NUM : ";cin>>m2;
	cout<<"ENTER THIRD NUM : ";cin>>m3;
	out<<endl<<m1<<endl<<m2<<endl<<m3<<endl;
	out1.close();

       //	ofstream out3("file3.txt")
	ifstream in("file1.txt");
	ifstream in1("file2.txt");
	in>>n1;
	cout<<n1;
	in1>>m1;
	cout<<endl<<m1;
	in>>n2;in1>>m2;
       //	cout<<n2<<endl<<m2;
	in>>n3;in1>>m3;
	//cout<<n1<<m1<<endl<<n2<<m2<<endl<<n3<<m3;
	in.close();
	in1.close();
getch();
}

