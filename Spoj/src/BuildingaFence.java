import java.util.Scanner;

public class BuildingaFence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()==true)
		{
			int n=sc.nextInt() ;
			if(n==0 )
				System.exit(0);
			
			
			double pie=Math.PI ;
			float rad=(float)(n/pie);
			System.out.printf("%.2f\n", (pie*rad*rad)/2) ;
		}
		sc.close();

	}

}
