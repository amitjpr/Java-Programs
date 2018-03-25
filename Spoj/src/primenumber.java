import java.util.Scanner;


public class primenumber 
{
	void sieveOfEratosthenes(int k , int n )
    {
        
        boolean prime[] = new boolean[n+1];
        prime[1]=false;
        for(int i=2;i<=n;i++)
            prime[i] = true;
         
        for(int p = 2; p*p <=n; p++)
        {
            
            if(prime[p] == true)
            {
                
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
         
       
        for(int i = k; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.println(i);
        }
        System.out.println();
    }
     
    
    public static void main(String args[])
    {   
    	Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0 ; i < t ;i++)
        {
         int k=sc.nextInt();
         int n=sc.nextInt();
        primenumber g = new primenumber();
        g.sieveOfEratosthenes(k ,n);
        }
    }
}