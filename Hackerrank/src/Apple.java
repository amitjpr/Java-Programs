import java.util.*;


public class Apple {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int i=0; i < m; i++){
            apple[i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int i=0; i < n; i++){
            orange[i] = in.nextInt();
        }
        int count =0 , count1 = 0 ; 
       for(int i = 0 ;i< m ; i++)
           {  int c = 0 ; 
             c=a+apple[i] ;
            if(c>=s && c<=t)
                count++ ; 
           }
         for(int i = 0 ;i< n ; i++)
           {  int c = 0 ; 
             c=b+orange[i] ;
            if(c>=s && c<=t)
                count1++ ; 
           }
        System.out.println(count);
        System.out.println(count1);
        in.close();
    }
}
