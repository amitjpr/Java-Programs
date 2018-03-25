import java.util.Scanner;

public class bitwise_and {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0 ; j<t;j++)
		{
			int a=sc.nextInt();
			int k=sc.nextInt();
			int c=0 ,max=0;
			for(int i=1 ; i<a ; i++)
			{
				for(int b=i+1 ; b<=a ;b++ )
				{
					 c = i&b ;
					if(c<k && c>max)
					{
						
						max=c;
					}
					
				}
			}
			System.out.println(max);	
		}
        sc.close();
	}

}
