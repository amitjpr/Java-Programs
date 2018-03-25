import java.util.Scanner;

public class Caesar_Cipher_Encryption {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		int k=sc.nextInt() ;
		k=k%26;
		char ch[]=s.toCharArray();
		for(int i=0 ; i<n ;i++)
		{
			int j=(int)ch[i];
			if(j<=90 && j>=65)
			{
				if(j+k<=90)
					j=j+k;
				else 
				{
					j=(j+k)%90 + 64;
				}
				System.out.print((char)j);
			}
			else if(j<=122 && j>=97)
			{
				if(j+k<=122)
					j=j+k;
				else 
				{
					j=(j+k)%122 + 96;
				}
				System.out.print((char)j);
			}
			
			else
				System.out.print((char)j);
		}
        sc.close();
	}

}
