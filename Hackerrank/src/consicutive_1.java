import java.util.Scanner;

public class consicutive_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count =0,max=0 ;
		int rem=0 ;
		
		while(n>0)
		{   
			
			rem=n%2;
			n=n/2 ;
			if(rem==1)
			{
				count++;
				if(count>max)
				max=count;
			}
			else if(rem==0)
				count=0;
		
		}
		
	  	System.out.println(max);
		
	}

}
