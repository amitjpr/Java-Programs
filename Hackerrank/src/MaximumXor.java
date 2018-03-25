import java.util.Scanner;

public class MaximumXor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int l= sc.nextInt() ;
		int r=sc.nextInt() ;
		int result = 0 ;
		int max=0 ;
		for (int i= l ;l<=r ;l++)
		{
			for (int j= i ;j<=r ;j++)
			 { 
				 result= l^j ;
				 System.out.println(l+" @ "+j+" = "+result );
				 if (result >= max)
					 max= result ;
			 }
		}
		System.out.println(max);
		sc.close();
	}

}
