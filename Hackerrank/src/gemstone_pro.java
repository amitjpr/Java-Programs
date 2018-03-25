import java.util.Arrays;
import java.util.Scanner;

public class gemstone_pro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt() ;
		sc.nextLine();
		int count=0;
		int arr[]=new int[26];
		
	    for(int i=0 ; i<a ;i++)
	    {
	    	String s=sc.nextLine() ;
	    	int arr1[]=new int[26];
	        for(int j=0;j<s.length();j++)
	        {
	        	int k = (int)s.charAt(j)-97;
	        	arr1[k]=1;
	        }
	       
	        for(int j=0 ;j<26;j++)
	        {  
	        	if(arr1[j]==1)
	        	{
	        		arr[j]++;
	        	}
	        
	        }
	    }
	    for(int j=0 ;j<26;j++)
        {  
        	if(arr[j]==a)
        	{
        		count++;
        	}
        }
	    System.out.print(count);
        sc.close();
	}

}
