import java.util.Scanner;

public class GradingStudent {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       for (int i=0 ; i< n ; i++)
         { 
    	   int grade=in.nextInt() ;
    	   int add=0,multiple =0,diff=0  ;
    	   if (grade<38)
    		   System.out.println(grade);
    	   else
    	   {
    		   add=grade%5 ;
    		   multiple=grade+(5-add);
    		   diff=multiple-grade ;
    		   if(diff<3)
    			   System.out.println(multiple);
    		   else 
    			   System.out.println(grade);
    		}
         }
        in.close();
	}

}
