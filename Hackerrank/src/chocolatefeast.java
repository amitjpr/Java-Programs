import java.util.Scanner;

public class chocolatefeast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t =sc.nextInt();
		for(int k=0 ; k<t;k++)
		{
			int n=sc.nextInt();
			int c=sc.nextInt();
			int m=sc.nextInt();
			
			int rap=n/c ;
			int total=rap ;
			while(rap>=m)
			{   int r=rap%m ;
				rap=rap/m ;
				
				total=total+rap ;
				rap=rap+r ;
			}
			System.out.println(total);
		}
		sc.close();

	}

}
