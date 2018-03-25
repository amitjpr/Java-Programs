import java.util.Scanner;

public class candy1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while( sc.hasNextInt()==true)
		{
			int t=sc.nextInt() ;
			if(t==(-1))
			{
				System.exit(0);
			}
			int arr[] =new int[t];
			int total=0 ;
			int rem=0 ,count=0;
			for(int i=0 ;i<t ;i++)
			{
				arr[i]=sc.nextInt() ;
				total=arr[i]+total ;
			}
			rem=total/t;
			if((total%t)!=0)
			{  
				System.out.println("-1");
			}
			else if((total%t)==0)
			{
				for(int i=0 ;i<t ;i++)
				{   
					int temp=0 ;
					if(rem>arr[i])
					{
						temp=rem-arr[i];
						count=count+temp ;
					}
				}
				System.out.println(count);
			}
		}
		
		
		sc.close();

	}

}
