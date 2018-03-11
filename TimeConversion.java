import java.util.Scanner; 

public class TimeConversion {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);		
     String str=sc.nextLine();
     char a =str.charAt(8);
     char b=str.charAt(0);
     char c=str.charAt(1);
     
     if(a=='A')
     { if(b==49 && c==50 )
       {  System.out.print("00");
    	   	for(int i = 2; i<(str.length()-2);i++)
    	      {
    		 System.out.print(str.charAt(i));
    	       }
    	}else 
    	{
    		for(int i = 0; i<(str.length()-2);i++)
  	      {
  		 System.out.print(str.charAt(i));
  	       }
    	}
     }
     else if(a=='P')
     { 
    	 if(b==49 && c==50 )
    	 {
    		 for(int i = 0; i<(str.length()-2);i++)
     	      {
     		 System.out.print(str.charAt(i));
     	       }
    	 } else 
    	 {
    		 String s=str.substring(0,2);
    		    int e=Integer.parseInt(s);
    		    int f=e+12;
    		    System.out.print(f);
    		 for(int i = 2; i<(str.length()-2);i++)
   	      {
   		 System.out.print(str.charAt(i));
   	       }
    	 }
     }
     
     sc.close();
	}

}
