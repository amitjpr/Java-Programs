import java.util.Scanner;

public class characterpattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt() ;
		for(int k=0 ;k<t ;k++)
		{
			int row=sc.nextInt() ;
			int col=sc.nextInt();
			int total =row*col ;
			int count=0 ;
		    for (int i=1 ; i<=total ;i++)
		    {       if (col%2==1)
	    	          {
		            	if( i%2 ==1 )
		    		      System.out.print("*");
		    	        else if(i%2==0 )
		    		      System.out.print(".") ;
		    	        if(i%col==0)
		    		      System.out.println();
		              }	
		    else {        if( (i+count)%2 ==1 )
  		                     System.out.print("*");
	                   else if((i+count)%2==0 )
		                    System.out.print(".") ;
	                    if(i%col==0)
	                    {   System.out.println();
	                        count++; 
	                    }
		          }
		    }
			System.out.println();
		}
		
        sc.close();
	}

}
