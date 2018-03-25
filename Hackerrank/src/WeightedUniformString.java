import java.util.Scanner;

public class WeightedUniformString {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
     	String s=sc.nextLine() ;
        char ch[]=s.toCharArray();
        int len=ch.length  ;
       
        int t=sc.nextInt() ;
        
        int arr[]=new int[t] ;
        for (int i= 0 ; i<t;i++)
          {
            arr[i]=sc.nextInt() ;
            
          }
        
        
        
        int arr1[]=new int[len];
        
        
       for (int i=0 ; i<len ;i++)   // array making   
         {   
        	
        	int count1=0 ;
           b : for (int j=i ;j<len ;j++)
        	 {
        		if(ch[i]==ch[j])
        		{
        			count1++ ;
        			
        			arr1[i]=((int)ch[i]-96)*count1 ;
        			
        		}
        		else 
        		{
        			break  b ;
        		}
        		
        	 }
          }
        
        
        for(int i= 0 ;i<t ; i++)  //check
          {   int count =0 ;
              a :for (int j=0 ;j<arr1.length ;j++)
                    {
                      if(arr[i]==arr1[j])
                         {
                           System.out.println("Yes");
                           count++ ;
                           break a ;

		                 }
                      }
                 if(count==0)
                	 System.out.println("No");
           }
        sc.close();
    }
}
