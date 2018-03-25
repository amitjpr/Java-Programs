import java.util.Scanner;

public class hurdle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        int max=0 ;
        for(int i=0; i < n; i++)
        {
            height[i] = in.nextInt();
            if (height[i]>max)
                max=height[i]; 
        }
        if(max>k)
            System.out.println(max-k);
        else if (max<=k  )
            System.out.println(0);
        in.close();
    }
}