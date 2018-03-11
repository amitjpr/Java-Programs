
import java.util.*;


public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        if(v2<=v1)
            { 
              a: for (int i = 0 ;i<=10000 ; i++)
                  {  x1=x1+v1;
                     x2=x2+v2;
                     
                     if(x1==x2)
                        break a ;
                  }System.out.println("YES");
        } else 
            System.out.println("NO");
        in.close();
    }
}