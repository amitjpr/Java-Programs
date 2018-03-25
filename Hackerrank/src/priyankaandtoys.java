import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class priyankaandtoys {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner scan = new Scanner(System.in);
    int[] arr = new int[10001];
    int n = scan.nextInt();

    for(int i = 0; i < n; i++) {
        arr[scan.nextInt()]++;
    }

    int ans = 0;
    for(int i = 0; i < 10001; i++) {
        if(arr[i] > 0) {
            i += 4;
            ans++;
        }
    }

    System.out.println(ans);
}
    }
