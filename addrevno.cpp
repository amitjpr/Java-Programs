#include<stdio.h>

int main()
 { int t, i; 
   scanf("%d \n",&t ); 
   
   if(t<=10000)
{
   int m[t-1] , n[t-1]; 
    
	   for( i=0 ; i<=t-1 ; i++ )
   {    scanf("%d %d",&m[i],&n[i]);
   }
  
   for(i=0;i<=t-1;i++)
  { 
   int r1,r2 ,r3, sum1=0, sum2=0 ,sum3=0,sum=0 ;
  while(m[i]>0)
    {
    
    r1=m[i]%10;
    sum1=sum1*10 + r1;
    m[i]=m[i]/10;
    }
	 while(n[i]>0)
    {
    
    r2=n[i]%10;
    sum2=sum2*10 + r2;
    n[i]=n[i]/10;
    }   	
    
	sum3=sum1+sum2 ; 
    
     while(sum3>0)
    {
   
    r3=sum3%10;
    sum=sum*10 + r3;
     sum3=sum3/10;
    
    }   printf("%d\n",sum);
    
   	 } 
		 }
return 0 ;
  }
