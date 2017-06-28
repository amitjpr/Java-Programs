import java.util.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int arr[]=new int[n];
        int count =0;
        for(int i=0 ; i<n ; i++)
          {
        	arr[i]=sc.nextInt();
          }
         for(int i=0 ; i<n ; i++)
         {   int a =0 ,c;
            for (int j=i+1 ; j<n ; j++)
        	 {  
        		c=(arr[i]+arr[j])%d ; 
        		a=a+c ; 
        	 }
        	 if(a==0)
        	 { 
        		 count++;
              }
         }
         System.out.println(n-count);
        sc.close();
    }
}