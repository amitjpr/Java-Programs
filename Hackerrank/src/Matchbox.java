import java.util.Scanner;

public class Matchbox {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int arr1[]=new int[c];
        int arr2[]=new int[c];
        for (int i=0 ;i<c ;i++)
        {
        	arr1[i]=in.nextInt();
        	arr2[i]=in.nextInt() ;
        }
        int temp =0 ,temp1 =0 ;
        for (int i=0 ;i<c-1 ;i++)
        {
        	for (int j=i+1 ; j<c ; j++)
        	{
        		if(arr2[j]>arr2[i])
        		{
        			temp=arr2[j];
        			arr2[j]=arr2[i] ;
        			arr2[i]=temp ;
        			
        			temp1=arr1[j];
        			arr1[j]=arr1[i] ;
        			arr1[i]=temp1 ;
        		}
        	}
        }
        for(int i=0; i<c;i++ )
        {
        	System.out.println(arr1[i]+"  "+arr2[i]);
        }
        int total =0 ,count=0  ;
       a : for (int i=0 ;i<c ;i++)
           {
        	  if((arr1[i]+count)<=n)
        	  {
        		  total=total+(arr2[i]*arr1[i]) ;
        		  count=count+arr1[i] ;
        	  }
        	  else if((arr1[i]+count)>n)
        	  {
        		  for (int j=0 ;j<arr1[i];j++)
        		  {   if(count==n)
    			       {
    				     break a;
    			       }
        			  total=total+arr2[i];
        			  count++;
        		 }
        	  }
        	  
           }
        System.out.println(total);
        in.close();
	}

}
