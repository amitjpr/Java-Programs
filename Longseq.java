import java.util.*; 

class Longseq
{ public static void main(String args[])
    {  Scanner sc=new Scanner(System.in);
	   int t =sc.nextInt() ; 
	    for(int z=0;z<t;z++){
	   String s= sc.next();
        int count1=0 , count=0  ;
	   for(int i=0;i<s.length();i++)
              {char ch=s.charAt(i);
                if(ch=='1')
                  count++ ;
                 else 
                   count1++ ;				 
                }
		if(count==1 || count1==1)		
		  System.out.println("Yes");
		  else 
		   System.out.println("No");
	}
	} 
}