import java.util.*; 

class MulMatrix
{ public static void main(String args[])
    {  Scanner sc = new Scanner(System.in) ;
	   System.out.println("Enter the size of the matrix m*n");
	   System.out.println("m :");
	   int m=sc.nextInt() ;
	   System.out.println("n :");
       int n=sc.nextInt() ;
       int arr[][]=new int[m][n];
	   int abb[][]=new int[m][n];
	   int sum[][]=new int[m][n] ;
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
		     System.out.print(arr[i][j] +"  ");
              System.out.println(" ");			 
		   }	   		
		
        for (int i = 0 ; i<m ; i++)
           { for(int j=0 ; j<n ; j++)
		     { for(int k=1 ; k<n ; k++)
			    {  sum[i][j]=arr[i][k]*abb[k][j] + sum[i][j] ;
				}
		     }			 
		   }
		 System.out.println("The matrix after multiplication is ");  
		for (int i = 0 ; i<m ; i++)
           { for(int j=0 ; j<n ; j++)
		     System.out.print(sum[i][j] +"  ");
              System.out.println(" ");			 
		   }	   		   
	 }
 }