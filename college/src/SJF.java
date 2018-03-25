import java.util.Scanner;

public class SJF {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,min,k=1,btime=0;
		System.out.println(" -------Shortest Job First Scheduling ( NP )-------\n");
		System.out.println("\nEnter the No. of processes :");
		n=sc.nextInt();
		 
		int p[]={1,2,3,4,5,6,7,8,9,10} ; 
		
		int bt[]=new int[n];
		int at[]=new int[n];
		int wt[]=new int[n];
		int tt[]=new int[n];
		
		int ta=0,sum=0,temp,j;
		float wavg=0,tavg=0,tsum=0,wsum=0;
		
		for(i=0;i<n;i++)
		{
			System.out.println("\tEnter the burst time of "+(i+1)+"  process :");
		bt[i]=sc.nextInt() ;
		System.out.println("\tEnter the arrival time of "+(i+1)+"  process :");
		at[i]=sc.nextInt() ;
		}
		 
		/*Sorting According to Arrival Time*/
		 
		for(i=0;i<n;i++)
		{
		for(j=0;j<n;j++)
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
		 
		/*Arranging the table according to Burst time,
		Execution time and Arrival Time
		Arrival time <= Execution time
		*/
		 
		for(j=0;j<n;j++)
		{
		btime=btime+bt[j];
		min=bt[k];
		for(i=k;i<n;i++)
		{
		if (btime>=at[i] && bt[i]<min)
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
		
		
		wt[0]=0;
		for(i=1;i<n;i++)
		{
		sum=sum+bt[i-1];
		wt[i]=sum-at[i];
		wsum=wsum+wt[i];
		}
		 
		wavg=(wsum/n);
		for(i=0;i<n;i++)
		{
		ta=ta+bt[i];
		tt[i]=ta-at[i];
		tsum=tsum+tt[i];
		}
		 
		tavg=(tsum/n);
		 
		System.out.println("************************");
		System.out.println("\n RESULT:-");
		System.out.println("\nProcess\t Burst\t Arrival\t Waiting\t Turn-around" );
		for(i=0;i<n;i++)
		{
			System.out.println(p[i]+"   "+bt[i]+"  "+at[i]+"  "+wt[i]+"  "+tt[i]);
		}
		 
		System.out.println("\n\nAVERAGE WAITING TIME :"+wavg);
		System.out.println("\nAVERAGE TURN AROUND TIME :"+tavg);
       sc.close();
	}

}
