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
      {  long long int a=1 ;
         if (b[i]<=100 &&b[i]>=1)
      	{
		  for ( ; b[i]>0 ; b[i]--)
      	  {
      	  	a=b[i]*a ;
      	  } 
      	  
         
         printf("\n%lld ",a);}
      }
    }  return 0 ; 
}
