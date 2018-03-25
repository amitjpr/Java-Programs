import java.util.Scanner;

public class Backtoorigin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        long xTreasure = in.nextLong();
        long yTreasure = in.nextLong();
        int n = in.nextInt();
        long arr1[]=new long[n];
        long arr2[]=new long[n];
        for (int i=0 ;i< n ;i++)
            {
               arr1[i]=in.nextLong();
               arr2[i]=in.nextLong() ;
            }
        for(int i=0 ;i<n ; i++)
        {     if (arr1[i]>=0 && arr2[i]>=0 )
               {	xTreasure=xTreasure-arr1[i] ;
                 	yTreasure=yTreasure-arr2[i] ;
               }
            else  if(arr1[i]<0 && arr2[i]>=0 )
            {	xTreasure=xTreasure+(arr1[i]*(-1)) ;
         	    yTreasure=yTreasure-arr2[i] ;
            }
            else  if(arr1[i]>=0 && arr2[i]<0 )
            {	xTreasure=xTreasure-arr1[i] ;
         	    yTreasure=yTreasure+(arr2[i]*(-1)) ;
            }
            else 
            {	 xTreasure=xTreasure+(arr1[i]*(-1)) ;
                 yTreasure=yTreasure+(arr2[i]*(-1)) ;
             }
        }
        System.out.println(xTreasure+" "+yTreasure);
        in.close();
	}

}
