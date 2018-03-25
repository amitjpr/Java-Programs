import java.util.Scanner;

public class ques_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0 ; k<t; k++ )
		{
			    int sum=0;int flag=0 , total=0;
			    int c=0,d=0,b=0;
			    int max=Integer.MIN_VALUE;
			    int min=Integer.MAX_VALUE;
				int arr[][]=new int[3][4];
				for(int i=0 ; i<3 ;i++)
				{    sum=0;
					for(int j=0 ;j<3 ;j++)
					{
						arr[i][j]=sc.nextInt();
						sum=sum+arr[i][j];
						
					}
					arr[i][3]=sum;
					if(sum>max)
					{c=i ;
						max=sum;
					}
					if(sum<min)
					{d=i ;	min=sum;
					}
					
				}
				if(c==0 && d==1)
					b=2;
				if(c==0 && d==2)
					b=1;
				if(c==1 && d==0)
					b=2;
				if(c==1 && d==2)
					b=0;
				if(c==2 && d==1)
					b=0;
				if(c==2 && d==0)
					b=1;
				//System.out.println(c+" "+d+" "+b);
				a :for(int j=2 ; j>=0 ;j--)
				{
					if(arr[c][j]-arr[b][j]<0)
					{
						flag=1 ;
						System.out.println("no");
						break a;
						
					}
					if(arr[c][j]-arr[b][j]==0)
					{
						total++;
					}
					if(total==3)
					{
						flag=1 ;
						System.out.println("no");
						break a;
					}
				}
				total=0 ;
				if(flag==0)
				{
				b : for(int j=2 ; j>=0 ;j--)
				{
					if(arr[b][j]-arr[d][j]<0)
					{
						flag=1 ;
						System.out.println("no");
						break b;
					}
					if(arr[b][j]-arr[d][j]==0)
					{
						total++;
					}
					if(total==3)
					{
						flag=1 ;
						System.out.println("no");
						break b;
					}
				}
				}
				if(flag==0)
					System.out.println("yes");
				
				
		}
	}

}
