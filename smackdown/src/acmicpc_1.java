import java.util.Scanner;

public class acmicpc_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	
		for(int k=0 ;k<t;k++)
		{   int sum=0;int flag=0;
			int arr[][]=new int[3][4];
			for(int i=0 ; i<3 ;i++)
			{    sum=0;
				for(int j=0 ;j<3 ;j++)
				{
					arr[i][j]=sc.nextInt();
					sum=sum+arr[i][j];
					
				}
				arr[i][3]=sum;
				
			}
			
			
			
				if(arr[0][3]>arr[1][3])
				{
					if((arr[0][0]<arr[1][0])||(arr[0][1]<arr[1][1])||(arr[0][2]<arr[1][2]))
					{
						flag=1;
						System.out.println("no");
						break ;
					}
				}
				if(arr[0][3]<arr[1][3])
				{

					if((arr[0][0]>arr[1][0])||(arr[0][1]>arr[1][1])||(arr[0][2]>arr[1][2]))
					{
						flag=1;
						System.out.println("no");
						break;
					}
				}
                if(arr[1][3]>arr[2][3])
                {
				  
                	if((arr[1][0]<arr[2][0])||(arr[1][1]<arr[2][1])||(arr[1][2]<arr[2][2]))
                	{
                		flag=1;
					System.out.println("no");
					break;
                	}
                }
                if(arr[1][3]<arr[2][3])
                {
				    if((arr[1][0]>arr[2][0])||(arr[1][1]>arr[2][1])||(arr[1][2]>arr[2][2]))
				    {
				    	flag=1;
					System.out.println("no");
					break;
				    }
                }
                
                if(arr[0][3]>arr[2][3])
                {
				  
                	if((arr[0][0]<arr[2][0])||(arr[0][1]<arr[2][1])||(arr[0][2]<arr[2][2]))
                	{
                		flag=1;
					System.out.println("no");
					break;
                	}
                }
                if(arr[0][3]<arr[2][3])
                {
				    if((arr[0][0]>arr[2][0])||(arr[0][1]>arr[2][1])||(arr[0][2]>arr[2][2]))
				    {
				    	flag=1;
					System.out.println("no");
					break;
				    }
                }
                 if(flag==0)
                System.out.println("yes");
			
		}  
        
	}

}
