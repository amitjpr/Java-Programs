import java.util.Scanner;

public class Fcfs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of process");
		int n=sc.nextInt() ;
		int at[]=new int[n];
		int bt[]=new int[n];
		int p[]=new int[n];
		int temp=0 ;
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
		int burst=0 , tat =0,wt=0;
		for(int i=0 ; i<n ; i++)
		{
			burst=burst+bt[i];
			tat=burst-at[i] ;
			wt=tat-bt[i];
			if(wt<0)
				wt=0;
		 System.out.println("process"+p[i]+ "   "+at[i]+"   "+bt[i]+"   "+tat+"   "+wt);
		}
		sc.close();

	}

}
