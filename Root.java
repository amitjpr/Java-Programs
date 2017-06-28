import java.util.*;
import java.lang.*;

class Root
{   public static void main(String args[])
     {  Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the coefficient of x^2 , x  and x^0");
		int a=sc.nextInt() ; 
		int b=sc.nextInt();
		int c=sc.nextInt();
		double r ,s ,t; 
		r=Math.sqrt((b*b)-(4*a*c));
		s=((-b)+r)/(2*a) ; 
		t=((-b)-r)/(2*a) ;
		System.out.println("The roots are :  " +s+ " And "+t) ;
	   }

}