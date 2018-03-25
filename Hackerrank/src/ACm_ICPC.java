import java.math.BigInteger;
import java.util.Scanner;

public class ACm_ICPC {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int m=sc.nextInt();
			BigInteger b[]=new BigInteger[n];
			
			for(int i=0 ;i< n ;i++)
			{
				b[i]=sc.nextBigInteger();
				
			}
			 int count =0, count1=0, max=Integer.MIN_VALUE ;       
	        for(int i=0 ;i <n-1 ; i++)
	        {    
	        	for(int j=i+1 ; j< n ;j++)
	        	{
	        		BigInteger b1=b[i].add(b[j]);
	        		String s=b1.toString();
	        		char ch[]=s.toCharArray();
	        		
	        		count=0;
	        		for(int k=0 ;k<s.length() ; k++)
	        		{
	        		   if(ch[k]!='0')
	        		   {
	        			   count++;
	        		   }
	        		}
	        		
	        		
	        		if(count>max)
	    			{
	    			max=count;
	    			count1=1 ;
	    			}
	        		else if(count==max)
	    			{
	    			count1++ ;
	    			}	
	        	}
	        }
	        System.out.println(max);
	        System.out.println(count1);
	  }

}
