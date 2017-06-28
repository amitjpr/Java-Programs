import java.util.*;
public class PlusMinus {

	public static void main(String[] args) {
		double d=1/6f;
		System.out.printf("%.5f",d);
		
		Scanner sc=new Scanner(System.in);
        int  b=sc.nextInt();
        int a[]=new int[b];
        double p=0f , z=0f , n=0f;
        double x=b ;
       
        for (int i=0 ; i<b ; i++)
            {
             a[i]=sc.nextInt();
            if(a[i]>0)
                p++;
            else if(a[i]<0)
                n++;
             else if (a[i]==0)
                z++;
             }
        System.out.printf("%.5f",(p/x));
        System.out.println();
        System.out.printf("%.5f",(n/x));
        System.out.println();
        System.out.printf("%.5f",(z/x));
        sc.close();

	}

}
