import java.util.Scanner ; 

class Harmonic 
{  public static void main(String args[])
    {  Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number upto which u want to find the sum "); 
	   int n=sc.nextInt();
	   double sum =0 ; 
	   for (double i =1 ; i<=n ; i++) 
	   { 
	     sum= sum + (1/i);
		 }
		System.out.println("The sum is : "+sum);  
	  }
 }