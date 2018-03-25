import java.util.*;


public class Dayofthe_programmer {

    static String solve(int year)
    {
          int a = year ;
          int date =0 , month = 9  ;
          if(a ==1918)
          {
        	  date=26 ;
        	  
          }else if (a<1918 && a>=1700)
          {
        	  if(a%4==0)
        	  {
        		  date=12;
        	  }
        	  else 
        		  date = 13 ; 
          }else
          {
        	  if((a%400)==0  || ((a%4==0) && (a%100)!=0) )
        	  {
        		  date=12;
        	  }
        	  else 
        		  date = 13 ; 
          }
          
          String s= date+".0"+month+"."+a ;
          return s ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
        in.close();
    }
}
