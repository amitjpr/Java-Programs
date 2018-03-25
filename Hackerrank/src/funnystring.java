import java.util.Scanner;

public class funnystring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int i =0 ; i< t ;i++)
		{
			String s=sc.nextLine();
			int n=s.length();
			char ch[]=s.toCharArray() ;
			int count=1 ,x =0,y=0;
			b :for(int j=0 ;j< n-1 ;j++)
			{   x=Math.abs(( (int)ch[j+1]-(int)ch[j]));
			    y=Math.abs(((int)ch[n-1-j]-(int)ch[n-2-j]));
				if( x!=y )
				{
					count=0;
					break b;
				}
			}
			if(count==0)
				System.out.println("Not Funny");
			else
				System.out.println("Funny");
		}
		
        sc.close();
	}

}
