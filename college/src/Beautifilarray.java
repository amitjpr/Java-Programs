import java.util.Scanner;

class COZIA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0 ;i<n;i++)
		{
			int a=sc.nextInt();
			int arr1[]=new int[a];
			for(int j=0 ;j<a ;j++)
			{
				arr1[j]=sc.nextInt();
			}
			int count =0 ;
			b :for(int j=0 ; j< a-1 ; j++)
			{
				for(int k=j+1 ; k<a ;k++)
				{
					if(arr1[j]<=arr1[k])
					{
						System.out.println("YES");
						count++ ;
						break b;
					}
				}
			}
			if(count==0 )
			{System.out.println("NO");}
		}
  sc.close();
	}

}
