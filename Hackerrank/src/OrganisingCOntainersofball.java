import java.util.Scanner;

public class OrganisingCOntainersofball {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++)
        {
            int n = in.nextInt();
            int[][] M = new int[n][n];
            for(int M_i=0; M_i < n; M_i++){
                for(int M_j=0; M_j < n; M_j++){
                    M[M_i][M_j] = in.nextInt();
                }
            }
            int count=0 ;
            int sum[]=new int[n] ;
            for (int i=0 ;i<n ;i++)
            {   sum[i]=0 ;
            	for(int j=0 ;j<n;j++)
            	{
            		sum[i]=sum[i] + M[j][i];
            	}
            }
            for (int i=0 ;i< n  ; i++)
            {
            	if(sum[i]>n)
            		count++ ;
           }
            if(count==0 )
        		System.out.println("Possible");
        	else 
        		System.out.println("Impossible");
            
            
            
        }
       in.close();
	}

}
