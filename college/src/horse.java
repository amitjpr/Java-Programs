import java.util.Scanner;

public class horse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0 ; i < t ; i++)
		{
			int d=sc.nextInt();
			int n=sc.nextInt();
			double min=Integer.MAX_VALUE ;
			double max=0 ;
			for(int j=0 ; j< n ;j++)
			{
				int k=sc.nextInt();
				int s=sc.nextInt();
				if(s<=min)
				{
					min= s ;
					max=k ;
				}
			}
			double a=(d-max)/min ;
			double b= d/a ;
			System.out.printf("Case #"+(i+1)+": "+"%6f",b);
			System.out.println();
			
		}

	}

}
