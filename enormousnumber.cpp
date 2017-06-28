#include<stdio.h>

int main()
{   int n, k ,c=0, i; 
   scanf("%d %d",&n , &k ) ;
   
  if(n<=10000000 && k<=10000000) 
  {   int a[n-1];
     for ( i=0 ; i<=n-1 ; i++)
      { scanf("\n%d",&a[i]);
         if (a[i]>1000000000)
         {return 0 ;
		 }
       }
     for (i=0  ; i<=n-1 ; i++)
	  { 
	    if (a[i]%k==0)
	    { c=c+1;
		}
      }
      printf("\n%d",c);
	}return 0 ;
}
