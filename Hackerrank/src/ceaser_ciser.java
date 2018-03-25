import java.util.Scanner;

public class ceaser_ciser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    
	    sc.nextLine();
	    String s=sc.nextLine();
	    
	    int k=sc.nextInt() ;
	    
	    char ch[]=s.toCharArray();
	   a: for(int i=0 ;i< s.length() ;i++)
	    {   
	    	if (ch[i]=='-')
	    	{   if(i==(n-1))
	    		break a;
	    	
	    		i++ ;
	    	}
	    	
	    	ch[i]=(char)(ch[i]+k);
	    	if(i==(n-1))
	    		break a;
	    }
     for(int i : ch)
    	 System.out.print((char)i);
	}

}
