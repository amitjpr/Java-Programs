import java.util.Scanner; 

class Pallindrome
{  public static void main(String args[])
     {  Scanner sc=new Scanner(System.in); 
	    System.out.println("Enter the number u want to check ");
		int n=sc.nextInt(); 
		int r , s=0 , t;
          t=n ;		
		while(n>0)
		{  r=n%10 ; 
		   s=s*10 +r ; 
		   n=n/10 ; 
		}
		if(s==t )
		System.out.println("The number "+t+ " is a pallindrome");
		else 
		System.out.println("The number "+t+ " is not a pallindrome"); 
	   
	   }
 }