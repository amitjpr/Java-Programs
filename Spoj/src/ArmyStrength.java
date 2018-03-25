import java.util.Scanner;

public class ArmyStrength {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in) ;
	  int t=sc.nextInt() ;
	  for(int i=0 ; i<t ; i++)
	  {
		  int a=sc.nextInt() ;
		  int b=sc.nextInt(); 
		  int arr1[]=new int[a];
		  int arr2[]=new int[b] ;
		  int sum=0 , sum1=0 ;
		  for(int j=0 ;j<a ; j++)
			  { arr1[j]=sc.nextInt() ;
			    sum=sum+arr1[j] ;
			  }
		  for(int j=0 ;j<b ; j++)
		  { arr2[j]=sc.nextInt() ;
		    sum1=sum1+arr2[j] ;
		  }
		  if (sum>=sum1)
		  {
			  System.out.println("Godzilla");
		  }
		  else 
			  System.out.println("MechaGodzilla");
	  }
	  sc.close(); 
	}

}
