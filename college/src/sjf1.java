import java.util.Scanner;

public class sjf1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of process");
		int n=sc.nextInt() ;
		int at[]=new int[n];
		int bt[]=new int[n];
		int p[]=new int[n];
		int temp =0,timer= 0  ;
		for(int i=0 ; i< n ; i++)
		{
			System.out.println("Enter the arival time of process "+(i+1));
			at[i]=sc.nextInt() ;
			System.out.println("Enter the burst time of process "+(i+1));
			bt[i]=sc.nextInt() ;
			p[i]=i+1 ;
		}
		
		for(int i=0;i<n;i++)        // Sorting according to arrival time
		{
		    for(int j=0;j<n;j++)
		       {
		    	if(at[i]<at[j])
				{
				temp=p[j];
				p[j]=p[i];
				p[i]=temp;
				temp=at[j];
				at[j]=at[i];
				at[i]=temp;
				temp=bt[j];
				bt[j]=bt[i];
				bt[i]=temp;
				}
		       }
		}
		int k=1, min ;
		for(int j=0 ; j< n ; j++)
		{
			 timer=timer+bt[j];
			 min=bt[k];
			 for(int i= k ; i<n ; i++)
			 {
				if(at[i]<=timer && bt[i]<min )
				{
					temp=p[k];
					p[k]=p[i];
					p[i]=temp;
					temp=at[k];
					at[k]=at[i];
					at[i]=temp;
					temp=bt[k];
					bt[k]=bt[i];
					bt[i]=temp;
				}
			 }
			 k++;
			 if(k==(n-1))
				 break ;
		}
		
		
		sc.close();

	}

}
