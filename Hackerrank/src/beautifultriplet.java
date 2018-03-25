import java.util.Scanner;

class beautifultriplet
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int d=sc.nextInt();
	  int arr[]=new int[n];
	  for(int i=0 ; i< n ;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  int count=0 , count1=1 , m=0  ,a=0;
	  for(int i=0 ; i< n ;i++)
	  {   a=arr[i];
	      count1=1 ;
		 b : for(int j=i+1 ; j< n ;j++)
		  {  
			 m=arr[j]-a;
			 if(m==d)
			 {  a=arr[j];
				 count1++ ;
			 }
			
			 if(count1== 3)
				 {++count;
				   break b;
				 }
		  }
		  
	  }
	  System.out.println(count);
  }
}