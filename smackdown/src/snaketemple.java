import java.util.Scanner;

public class snaketemple
   {
	  public static void main(String[] args)
	    {
            Scanner sc=new Scanner(System.in);
            int n= sc.nextInt() ;
            for(int i=0 ; i< n ;i++)
              { 
            	int a=sc.nextInt();
            	int arr[]=new int[a];
            	int m=1 ;
            	int out=0 ; int count =1 ;
            	for(int j=0 ; j<a;j++)
            	{
            		arr[j]=sc.nextInt(); 
            		if(a%2 ==0)
            		{  out=1;
            		}
            		else if(a%2 ==1)
            		{
            		   if(arr[j]==m && count<(a+1)/2 )
            		     {
            			   m++ ;
            		      }
            		    else if(arr[j]==m && count==(a+1)/2)
            			    m-- ;
            		    else if(arr[j]==m && count>(a+1)/2 )
            			    m-- ;
            		     else
            		        {  out=1 ;
            		        }
            		}
            		count++ ;
            	}
            	if(m==0 && out==0)
            		System.out.println("yes");
            	else 
            		System.out.println("no");
            	
              }
sc.close();
	    }

  }
