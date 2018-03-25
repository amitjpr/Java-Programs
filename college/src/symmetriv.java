import java.util.Scanner;

public class symmetriv {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0 ;i<t;i++)
		{
			int n=sc.nextInt();
			sc.nextLine();
			String arr[]=new String[n];
			int flag=0 ;
			for(int j=0;j<n;j++)
			{
				arr[j]=sc.nextLine();
				
			}
			a :for(int k=0 ;k<n/2;k++)
			{
				if(arr[k].matches(arr[n-1-k])==false)
				{
					flag=1;
					break a;
				}
			}
			 if(flag==0)
			{
				b : for(int j=0 ;j<n;j++)
				{
					String str=arr[j];
					String reverse = new StringBuffer(str).reverse().toString();
					if(str.substring(0, n/2).matches(reverse.substring(0,n/2))==false)
					{
						flag=1;
						break b;
					}	
				}
			}
		if(flag==1)
				System.out.println("NO");
			else if(flag==0)
				System.out.println("YES");
		}

	}

}
