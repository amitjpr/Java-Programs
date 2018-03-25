import java.util.Scanner;

public class optimal 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of process");
        int n= sc.nextInt();
        int arr[]=new int[n];
        int min ,index , index1;
        for(int i=0 ; i< n ;i++)
        {
        	arr[i]=sc.nextInt(); 
        }
        System.out.println("enter the number of frames");
        int f=sc.nextInt()  ;
        int arr1[]=new int[f];
        int arr2[]=new int[f];
        int pagefault= 0;
        for (int i=0 ; i < n ; i++)
        {
             if (i < f ) // fill the frame 
             {
            	 arr1[i]=arr[i];
            	 pagefault++ ;
             }
             else if(i >= f)
             {
            	 
            	 min=0 ;
            	a : for (int j= 0 ; j < f ; )  // if same value comes it will change the value of count
            	 {
            		 if(arr1[j]==arr[i])
            		 {
            			 
            			 j=0 ; i++ ;
            			 if(i== n)
            			 {
            				 System.out.println(pagefault);
            				 System.exit(0);
            				 
            			 }continue a;
            		 }
            		 ++j ;
            	 }
            	 for(int k=0;k<f ;k++)
            	 {
            		 arr2[k]=0;
            	 }
            	  index= 0 ;
            	  index1=0;
            	c : for (int j=0 ; j< f ; j++) // search the index 
            	 {
            		b : for(int k=i ; k< n ;k++)
            		 {
            			 if(arr1[j]==arr[k])
            			 {
            				 arr2[j]= k ;
            				 index= j ;
            				 break b ;
            			 }
            		 }      
            	         if (arr2[j]==0)
            	         {
            	        	 index1=j;
            	        	 break c ;
            	         }
            	         else   if(min<arr2[j])
            	              {
            	            	  min =arr2[j];
            	            	  index1= index ;
            	            	  
            	              }
            	 
            	 }
            	 arr1[index1]=arr[i];
            	 pagefault++;
            	 
            	 
            	 }
             }
        System.out.println(pagefault);
        sc.close(); 
	}

}
