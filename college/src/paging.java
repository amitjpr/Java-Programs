import java.util.Scanner;

public class paging {

	public static void main(String[] args) {
		int n , pgsize, logadd , pgno=0 , offset=0 , phyadd ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter process size in kb :-\n");
		n=sc.nextInt(); 
		System.out.println("Enter page size in bytes :-\n");
		pgsize=sc.nextInt() ;
		int totpag=(n*1024)/pgsize ;
		System.out.println("Total no. of pages = "+totpag);
		int a[]=new int[totpag];
		System.out.println("Now enter frame no. for diifrent pages ");
		for(int i = 0 ;i<totpag ; i++)
		{
			System.out.println("for pageno. "+i+" frame no. is ");
			a[i]=sc.nextInt() ;
		}
		System.out.println("Enter the logocal address" );
		logadd=sc.nextInt() ;
		pgno = logadd/pgsize ;
		offset= logadd%pgsize ;
		System.out.println("page no is "+pgno+ " offset is "+offset );
		phyadd=(a[pgno]*pgsize)+offset ;
		
		System.out.println("Physical address in decimal form is "+phyadd);
		System.out.println("physical address in binary form is "+Integer.toBinaryString(phyadd));
       
		sc.close();
	}

}
