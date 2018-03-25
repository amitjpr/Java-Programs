import java.util.Scanner;

public class hackerrankisastring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int i=0 ; i< t ;i++)
		{
			String s=sc.nextLine() ;
			char ch[]=s.toCharArray();
			String s1="hackerrank";
			char ch1[]=s1.toCharArray() ;
			int a=0 ;
			b : for(int j=0 ; j< s.length() ;j++)
			{
				if(ch[j]==ch1[a])
				{
					a++;
				}
				System.out.println(a);
				if(a==10)
					break b ;
						
			}
			if(a==10)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
