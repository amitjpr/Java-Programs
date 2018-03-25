import java.util.Scanner;

public class String_construction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0 ;i<n ;i++)
		{
			int arr[]=new int[26];
			int count=0;
			String s=sc.nextLine();
			for(int j=0 ;j<s.length();j++)
			{
				int k=(int)s.charAt(j)-97;
				arr[k]=1;
			}
			for(int j=0 ;j<26;j++)
			{
				if(arr[j]==1)
					count++;
			}
			System.out.println(count);
		}
      sc.close();
	}

}
