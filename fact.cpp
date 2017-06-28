#include<stdio.h>

int main()
 { int t; 
   
   scanf("%d",&t);
   if(t<=100 && t>=1)
     {  int b[t-1] ; 
        for(int i=0 ; i<=t-1 ; i++ )
        { scanf("%d",&b[i]);
        }
    
    for(int i = 0 ; i<=t-1 ; i++)
      {  double a=1 ;
         if (b[i]<=100 &&b[i]>=1)
      	{
		  for ( ; b[i]>0 ; b[i]--)
      	  {
      	  	a=b[i]*a ;
      	  } 
      	  int len=a.length(),c[len-1];
      	     while(a>0)
      	     {   r=a%10; 
      	         c[len-1]=r;
      	         a=a/10 ;
      	         len-- ; 
      	      }  
      	      
      	      
      	      for(int i=0 ; i<len-1 ; i++)
      	         {
				    printf("%d ",c[i]);
					} printf("\n")
      }
    }  return 0 ; 
}
