import java.util.Scanner;

public class climbingtheladder {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
       int temp[]=new int[n];
        int k=1 ;
        temp[0]=scores[0];
        for(int i=1 ; i< n ;i++)
            {  
               if(scores[i-1]!=scores[i])
                   {
                      temp[k]=scores[i];
                       k++ ;
                   }
             }
     /*   for(int i=0 ; i < m ; i++)
            {  
                int count=k;
               a: for (int j=0 ; j< k ;j++)
                    {
                        if (alice[i]>=temp[j])
                            {
                               System.out.println(j+1);
                            count++ ;
                                 break a; 
                             }
                    }
                 if(count==k )
                     System.out.println(count+1);
            }
*/
     
	}

}
