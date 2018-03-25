import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class marcs_cupcakes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        Arrays.sort(calories);
        long total=0l ;
        
        for(int i=n-1;i>=0;i--)
        {
        	total=total+(long)(calories[i]*Math.pow(2, n-1-i));
        	
        }
        System.out.println(total);
    }
}
