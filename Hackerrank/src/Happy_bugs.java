import java.util.Arrays;
import java.util.Scanner;

public class Happy_bugs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		int t=sc.nextInt();
		b : for(int l=0; l<t;l++)
		{
			int n=sc.nextInt();
			sc.nextLine();
			String str=sc.nextLine();
			int arr[]=new int[31];
			int k=0;
			int count=0 ;
			for(int i=0 ; i<str.length();i++)
			{
				char ch=str.charAt(i);
			    k=(int)ch-65;
				arr[k]++;
		    }
			
			count=0 ;
			a : for(int i=0 ; i<30;i++)
			{
				if(arr[30]>0)
				{  
					if(arr[i]==1)
					{
						count=1;
						break a;
					}	
						
				}
				else 
				{  
					Arrays.sort(arr);
						if(arr[30]==1)
						{count=1;
						break a ;}
					if(arr[30]>=1 && arr[29]>=1)
					{
						count=1;
						break a;
					}
				}
			}
			if(count==0)
				System.out.println("YES");
			else 
				if(count==1)
					System.out.println("NO");
		
		}

	}

}
