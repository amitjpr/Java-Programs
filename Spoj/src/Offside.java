import java.util.Arrays;
import java.util.Scanner;

public class Offside {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         while(sc.hasNextInt()==true)
         {
        	 int a=sc.nextInt();
        	 int d=sc.nextInt() ;
        	 if(a==0 && d==0)
        		 System.exit(0);
        	 else
        	 { 
        		 int b[]=new int[a];
        		 int c[]=new int[d];
        		 for(int i=0 ;i< a; i++)
        		 {
        			 b[i]=sc.nextInt() ;
        		 }
        		 for(int i=0 ;i< d; i++)
        		 {
        			 c[i]=sc.nextInt() ;
        		 }
        		 Arrays.sort(b);
        		 Arrays.sort(c);
        		 if(b[0]>=c[1])
        		 {
        			 System.out.println("N");
        			 
        		 }
        		 else 
        			 System.out.println("Y");
        		 
        		 
        	 }
         }
         
         sc.close();

	}

}
