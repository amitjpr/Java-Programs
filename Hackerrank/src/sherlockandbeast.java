import java.util.Scanner;

public class sherlockandbeast 
{

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();
	  a : for(int i=0 ; i<t ;i++)
	  {
		  int n=sc.nextInt();
		  int b =0 , c=0 ;
		  if(n==1 || n==2 || n==4 || n==7)
		  { 
			System.out.println(-1);
		    continue a;
		  } else
		  {
			  
			  if(n%3==0)
			  {
				  b=n/3;
			  }else if(n%3==1)
			  {
				  c=2;
				  b=(n-10)/3;
			  }else if(n%3==2)
			  {
				  c=1;
				  b=(n-5)/3;
			  }
		  }
		  for(int j=b ; j>0 ;j--)
		  {
			  System.out.print("555");
		  }
		  for(int j=c ; j>0 ;j--)
		  {
			  System.out.print("33333");
		  }
		  System.out.println();
	  }
     sc.close();
	}

}
