import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class absolutedifference
   {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE ;
        
        for(int i=0 ; i<n-1 ;i++)
        {   
        	
        	min=Math.min(min,Math.abs(arr[i+1]-arr[i]));
        }
        System.out.println(min);
        in.close();
    }
}
