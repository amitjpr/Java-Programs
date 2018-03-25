import java.util.Scanner ;

public class progress_pie {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in) ;
   int t=sc.nextInt() ;
   for (int i=0 ;i<t ; i++)
   {
	   //int per=sc.nextInt() ;
	   int x=sc.nextInt() ;
	   int y=sc.nextInt() ;
	   
	  // int ang=(per/100)*360 ;
	   
	   double angle = Math.atan(x/y);
	   System.out.println(angle);
   }
   
   sc.close();

	}

}
