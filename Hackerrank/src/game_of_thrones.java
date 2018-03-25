import java.util.Scanner;

public class game_of_thrones {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int arr[]=new int[26];
		int count=0 ;
		int odd=0;
		for(int i=0 ;i<s.length();i++)
		{
			int k=(int)s.charAt(i)-97 ;
			arr[k]++;
		}
		b :if(s.length()%2==0)
		{
			for(int i=0;i<26 ;i++)
			{
				if(arr[i]%2!=0)
				{
					count=1;
					break b ;
				}
			}
		}
		else c :if(s.length()%2==1)
		{
			for(int i=0;i<26 ;i++)
			{
				if(arr[i]%2==0)
				{
					count=0;
				}
				else
					odd++;
				if(odd>1)
				{
					count=1;
					break c;
				}
		
			}
		}
		if(count==1)
			System.out.println("NO");
		else if(count==0)
			System.out.println("YES");
		sc.close();

	}

}
