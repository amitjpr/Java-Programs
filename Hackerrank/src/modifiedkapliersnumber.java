import java.util.Scanner;

public class modifiedkapliersnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		int low=sc.nextInt() ;
		int high=sc.nextInt();
		 int count=0 ;
		for (int i= low ; i<=high ; i++)
		{                                                    
			long sq=i*i ;
			int flag=i ;
			long r=0 , sum=0 ;
			double j=0 ;
			while(flag>0)
			{   
				flag=flag/10 ;
				r=sq%10 ;
				sum=(long)Math.pow(10,j)*r +sum;
				sq=sq/10 ;
				j++ ;
			}
			if ((sq+sum)==i)
				  {
					System.out.print(i+" ");
					count++ ;
				
				  }       				
			
		}
		if(count==0)
			System.out.println("INVALID RANGE");
		sc.close();
	}
}
