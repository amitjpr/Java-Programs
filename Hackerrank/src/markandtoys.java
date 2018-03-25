import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class markandtoys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] prices = new int[n];
        for(int prices_i = 0; prices_i < n; prices_i++){
            prices[prices_i] = in.nextInt();
        }
        Arrays.sort(prices);
        int res=0 , total=0;
        for(int i=0 ;i<n && total<=k; i++)
        {
        	total=total+prices[i];
        	if(total<=k)
        	res++;
        }
        System.out.print(res);
        in.close();
    }
}
