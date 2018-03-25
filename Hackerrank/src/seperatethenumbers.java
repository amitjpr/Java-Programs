import java.util.Scanner;

public class seperatethenumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int q = sc.nextInt();
        for(int a0 = 0; a0 < q; a0++)
        {
            String s = sc.next();
            char ch[]=s.toCharArray() ;
             if (s.length()==1)
            	 System.out.println("NO");
             else
             {  int count=0 ;
            	 for(int i=0 ;i<  s.length()-1 ; i++)
            	 {     if(ch[i]!=ch[i+1]-1)
      		              {
      			             count++;
      			             
      	      	          }
            		 if( (int)((ch[i]-48)*10+(ch[i+1]-48))!=(int)((ch[i+2]-48)*10+(ch[i+4]-48))-1 )
            		 {
            			 
            		 }
            		 
            		 
            		 
            		 
            	 }
            	 if(count>0)
            		 System.out.println("NO");
            	 else 
            		 System.out.println("YES "+ch[0]);
             }
        }
		
		sc.close();
	}

}
