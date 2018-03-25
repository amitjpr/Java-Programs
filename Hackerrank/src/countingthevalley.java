import java.util.Scanner;

public class countingthevalley {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
	    
		char ch[]=s.toCharArray();
		int count=0 , total=0 ;
		for(int i=0 ;i <n ;i++)
		{
			if(ch[i]=='U')
				count++;
			else
				if (ch[i]=='D')
				count-- ;
			
			if (count==0 && ch[i]=='U')
				total++ ;
		}
		System.out.println(total);
         sc.close();
	}

}
