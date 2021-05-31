import java.util.*;
class P1
{
    public static void main(String randhir1[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Pattern : ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}
/*
Enter Size of Pattern : 5
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 


*/