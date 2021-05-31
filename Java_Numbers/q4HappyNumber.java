	//	Strong number in given range 

	import java.util.*;
	class HappyNumber
	{
		static void isHappy(int num)
		{
			//System.out.print("strong numbers are : ");	
			int nnn=num;
			int	rem;
			int	sum;
				while(true)
				//while(sum!=4)
				{
					rem=0;
					sum=0;
					do
					{
						rem=nnn%10;
						sum=sum + (rem*rem);
						nnn=nnn/10;
					}while(nnn!=0);
					nnn=sum;
					if(sum==num)
					{
						System.out.print("Unhappy Number !!");	//4
						break;
					}
					else if(sum==1)
					{
						System.out.print("Happy Number !!");//49
						break;	
					}
					
				}
			System.out.print("\n");	
		}
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			int num;
			System.out.print("Enter a number : ");
			num=sc.nextInt();
			isHappy(num);
		}
	}

	/*

	//	Strong number in given range 

	import java.util.*;
	class HappyNumber
	{
		static boolean isHappy(int x)
		{
			while(x>9)
			{
				int sum=0;
				do
				{
					int r=x%10;
					sum=sum+(r*r);
					x=x/10;
				}while(x!=0);
				System.out.println(sum);
				x=sum;
			}
			return x==1 || x==7;
		}
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			int num;
			System.out.print("Enter a number : ");
			num=sc.nextInt();
			boolean chk=isHappy(num);
			if(chk==true)
			{
				System.out.print("Happy Number !!");	//4
			}
			else
			{
				System.out.print("Not a Happy Number !!");//49
			}

			System.out.print("\n");	//4
		}
	}

	*/