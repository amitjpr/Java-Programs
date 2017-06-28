import java.util.Scanner; 

class Armstrong
{  public static void main(String args[])
     {  Scanner sc=new Scanner(System.in); 
	    System.out.println("Enter the value of n");
		int n=sc.nextInt(); 
		System.out.println("The Armstrong no. between 1 And " +n+ "are :");
		for(int i=1 ; i<=n ; i++)
		{
		int r , s=0 ,t=i;
		while(t>0)
		{  r=t%10 ; 
		   s=s + (r*r*r) ; 
		   t=t/10 ; 
		}
		if(s==i )
		System.out.print(" "+s+" ");
		
	   }
	   }
 }