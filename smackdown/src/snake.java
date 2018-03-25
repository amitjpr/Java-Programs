import java.util.Scanner;

public class snake {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		int n= sc.nextInt() ;
		for(int i=0 ;i < n ; i++)
		{
			int a =sc.nextInt();
			sc.nextLine() ;
			String s=sc.nextLine();
			char ch[]=s.toCharArray();
			int count =0 , out=0;
			  b :for(int j=0 ; j<a;j++)
		      	{
				   
				   if(ch[j]=='.')
					   continue b;
				   if (ch[j]=='H')
					   count=count+1 ;
				   if(count==2)
				   {
					   out=1 ;
					   break b ;
				   }
				   if (ch[j]=='T')
				   count=count-1 ;
				   if (count== -1)
				   {
					   out=1 ;
					   break b ;
				   }   
				   
		     	}
			if(out==0 && count==0)
				System.out.println("Valid");
			else
				System.out.println("Invalid");
			
		} sc.close();
	}

}
