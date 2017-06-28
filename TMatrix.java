import java.util.*; 

class TMatrix
{ public static void main(String args[])
    {  Scanner sc = new Scanner(System.in) ;
	   System.out.println("Enter the size of the matrix m*n");
	   System.out.println("m :");
	   int m=sc.nextInt() ;
	   System.out.println("n :");
       int n=sc.nextInt() ;
       int arr[][]=new int[m][n];
       System.out.println("Enter the numbers");	   
       for (int i = 0 ; i<m ; i++)
           { for(int j=0 ; j<n ; j++)
		     arr[i][j] = sc.nextInt() ; 
		   }	
        System.out.println("The matrix is ");
        for (int i = 0 ; i<m ; i++)
           { for(int j=0 ; j<n ; j++)
		     System.out.print(arr[i][j] +"  ");
              System.out.println(" ");	}  		   
		System.out.println("The transpose of matrix is ");
        for (int i = 0 ; i<m ; i++)
           { for(int j=0 ; j<n ; j++)
		     System.out.print(arr[j][i] +"  ");
              System.out.println(" ");			 
		   }	   		
		   
	 }
 }