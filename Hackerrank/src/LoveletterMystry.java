import java.util.Scanner;

public class LoveletterMystry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		int n=sc.nextInt() ;
		sc.nextLine() ;
		for(int k=0 ; k<n ;k++) {
		String s=sc.nextLine() ; 
		char ch[]=s.toCharArray() ; 
		int count = 0 ;
		int len = s.length() ;
		int mid =0 ;
		if( (len%2) ==0)
		   { 
			 mid = len/2 ;
		   }
		else mid= len/2 ;
		for(int i = 0 ; i<mid ; i++)
		{   
			if( ch[i]!=ch[(len-1)-i])
			{   if((int)(ch[(len-1)-i]-ch[i])>=0)
				count=count+ (int)(ch[(len-1)-i]-ch[i]);
			else 
				count= count -(int)(ch[(len-1)-i]-ch[i]) ; 
			}
		}
	   System.out.println(count);
		}
	   sc.close();
	}
	
}
