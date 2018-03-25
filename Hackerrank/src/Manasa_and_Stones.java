import java.util.Scanner;

public class Manasa_and_Stones {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int l=0 ;l<t ;l++)
		{
			int num=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int n=num-1;
			int sum=0 ;
			int temp=0 ;
			
			if(a!=b)
			{
			if (b<a)
			{	temp=b;
			    b=a;
			    a=temp;
			}
			
			for(int i=0;i<=n;i++)
			{   
				sum=(b*i)+(a*(n-i));
				System.out.print(sum+" ");
			}
	
			if(sum==0)
				System.out.println(sum);
			else
			System.out.println();
			}
			else
				System.out.println(n*a);
		}
        sc.close();
	}

}
