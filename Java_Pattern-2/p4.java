import java.util.*;
class P4
{
    public static void main(String randhir1[])
    {
        //int k=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Pattern : ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%2==0)
                {
                    System.out.print("0"+" ");
                }
                else
                {
                    System.out.print("1"+" ");
                }
                //k++;
            }
            System.out.print("\n");
        }
    }
}
/*

Enter Size of Pattern : 5
1 
0 0 
1 1 1 
0 0 0 0 
1 1 1 1 1 


*/