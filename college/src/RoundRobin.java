import java.util.Scanner;

public class RoundRobin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n, temp , j1=0 ,count=0 ; 
		float tsum=0 , wsum=0 ;
		System.out.println("Enter ther number of process : -");
		n=sc.nextInt() ;
		int at[]=new int[10];
		int bt[]=new int[10];
		int p[]=new int[10];
		int q[]=new int[10];
		boolean is[]=new boolean[10];
		int start[][]=new int[10][7];
		int end[]=new int[10];
		int wt[]=new int[10];
		int tt[]=new int[10];
		for(int i=0 ; i<n ;i++)
		{
			System.out.println("Enter the arrival time for process  :-"+(i+1));
			at[i]=sc.nextInt() ;
			System.out.println("Enter the burst time for process  :-"+(i+1));
			bt[i]=sc.nextInt() ;
			is[i]=false ;
			p[i]=(i+1) ;
		}
		
		System.out.println("Enter the quantum number : ");
		int tq=sc.nextInt() ;
		for(int i=0 ;i< n ;i++)
		{
			for(int j=0 ; j< n ;j++)
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
		int time =at[0];
		for (int i=0 ;i<n ; i++)
		{
			q[i]=bt[i];
		}
		while(count<n )
		{
			for(int i=0 ;i< n ; i++)
			{
				if((time>=at[i]) && (is[i]==false))
				{
					start[i][j1]=time ;
					if(bt[i]<=tq)
					{
						is[i]=true ;
						end[i]=time+bt[i] ;
						time=end[i];
						count++ ;
					}
					else if(bt[i]>tq)
					{
						bt[i]=bt[i]-tq ;
						time=time+tq ;
					}
				}
			}
			j1++ ;
		}
		System.out.println("process    Arrival time    burst time      waiting time     turnaround time");
		for(int i=0 ; i<n ;i++)
		{
			tt[i]=end[i]-at[i] ;
			wt[i]=tt[i]-q[i] ;
			wsum=wsum+wt[i] ;
			tsum=tsum+tt[i];
			System.out.println(p[i]+"     \t "+at[i]+"    \t"+q[i]+"    \t"+wt[i]+"     \t"+tt[i]);
		}
		
		System.out.println("Avg. WT : "+(wsum/n));
		System.out.println("Avg. tT : "+(tsum/n));
		sc.close();

	}

}
