import java.util.Scanner;

public class rectangles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double n=sc.nextInt();
		int cnt=0 ;
		int k=(int)Math.sqrt(n);
		for(int i=1;i<=k;i++)
		    for(int j=i+1;i*j<=n;j++)
		        cnt++;
		cnt+=k;
		System.out.println(cnt);
		sc.close();

	}

}
