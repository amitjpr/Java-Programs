import java.util.Scanner;

public class two_strings {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int p=sc.nextInt();
       sc.nextLine();
       for(int i=0 ;i<p ;i++)
       {
    	   String a=sc.nextLine();
    	   String b=sc.nextLine();
    	   int count=0 ;
    	   int arr[]=new int[26];
    	   int arr1[]=new int[26];
    	   for(int j=0 ;j<a.length();j++)
    	   {
    		   int k =(int)a.charAt(j)-97;
    		   arr1[k]=1;
    	   }
    	   for(int j=0 ;j<b.length();j++)
    	   {
    		   int k =(int)b.charAt(j)-97;
    		   arr[k]=1;
    	   }
    	   c :for(int j=0 ;j<26 ;j++)
    	   {
    		   if(arr1[j]==arr[j] && arr1[j]==1)
    		   {
    			   count=1;
    			   break c;
    		   }
    	   }
    	   if(count==1)
    		   System.out.println("YES");
    	   if(count==0)
    		   System.out.println("NO");
       }
	}

}
