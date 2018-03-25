import java.util.Scanner;

public class toandfro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()==true)
		{
			int n=sc.nextInt();
			if(n==0)
				System.exit(0);
			sc.nextLine();
			
			String s1= sc.nextLine();
			int len=s1.length();
			int row=len/n ;
			char ch[]=s1.toCharArray();
			for(int i=1 ;i<=n ;i++)
			{  int count=0 ;
				for(int j=1 ;j<=row ;j++)
				{   
					if ( (j%2)!=0)
					System.out.print(ch[i+count-1]) ;
					else if((j%2)==0)
					{
						count =count+(2*n) ;
						System.out.print(ch[count-i]);
					}
				}
			}
			System.out.println();
		}
        
		sc.close();
	}

}
