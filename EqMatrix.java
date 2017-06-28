import java.util.*; 

class EqMatrix
{ public static void main(String args[])
    {  Scanner sc = new Scanner(System.in) ;
	   System.out.println("Enter the size of the matrix m*n");
	   System.out.println("m :");
	   int m=sc.nextInt() ;
	   System.out.println("n :");
       int n=sc.nextInt() ;
       int arr[][]=new int[m][n];
	   int abb[][]=new int[m][n];
	   
       System.out.println("Enter the numbers of first matrix");	//First matrix input   
       for (int i = 0 ; i<m ; i++)
           { for(int j=0 ; j<n ; j++)
		     arr[i][j] = sc.nextInt() ; 
		   }	   
		System.out.println("Enter the numbers of second matrix");//second matrix input	   
       for (int i = 0 ; i<m ; i++)
           { for(int j=0 ; j<n ; j++)
		     abb[i][j] = sc.nextInt() ; 
		   }   
		System.out.println("The first matrix is ");
        for (int i = 0 ; i<m ; i++)
           { for(int j=0 ; j<n ; j++)
		     System.out.print(arr[i][j] +"  ");
              System.out.println(" ");			 
		   }				
		   System.out.println("The second matrix is ");
        for (int i = 0 ; i<m ; i++)
           { for(int j=0 ; j<n ; j++)
		     System.out.print(abb[i][j] +"  ");
              System.out.println(" ");			 
		   }	   		
		
       a: for (int i = 0 ; i<m ; i++)
           { for(int j=0 ; j<n ; j++)
		     { if(arr[i][j]!=abb[i][j])
			    { System.out.println("The matrix is not equal");
				  break a  ; 
				  }
			 }		 
		   }
		 
        	   
		   
	 }
 }