import java.util.Scanner;

public class Lru 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of process");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0 ; i< n ;i++)
        {
        	arr[i]=sc.nextInt(); 
        }
        System.out.println("enter the number of frames");
        int f=sc.nextInt()  ;
        int arr1[]=new int[f];
        int arr2[]=new int[f];
        int count=1 ;
        int pagefault= 0;
        for (int i=0 ; i < n ; i++)
        {
             if (count <= f ) // fill the frame 
             {
            	 arr1[i]=arr[i];
            	 arr2[i]=count;
            	 count++ ;
            	 pagefault++ ;
             }
             else if(count > f)
             {
            	 int min =Integer.MAX_VALUE ;
            	a : for (int j= 0 ; j < f ; )  // if same value comes it will change the value of count
            	 {
            		 if(arr[i]==arr1[j])
            		 {
            			 arr2[j]=count++ ;
            			 j=0 ; i++ ;
            			 if(i== n)
            			 {
            				 System.out.println("Total no. of pagefault are:- "+pagefault);
            				 System.exit(0);
            				 
            			 }continue a;
            		 }
            		 j++ ;
            	 }
            	 int index=0  ;
            	 for(int j= 0 ; j< f ; j++) //min index
            	 {
            		 if (min>arr2[j])
            			  {
            			    min=arr2[j];
            			    index= j ;
            			  }
            	 } 
            	 
            	 arr1[index]=arr[i];
            	 arr2[index]=count++ ;
            	 pagefault++ ;
            	 }
             }
        System.out.println("Total no. of pagefault are:- "+pagefault);
        sc.close(); 
	}

}
