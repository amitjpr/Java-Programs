import java.util.Arrays;
import java.util.Scanner;

public class Cutthestick {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int arr[]=new int[n];
		for (int i =0 ; i<n ; i++)
		   arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
        int min = arr[0];
        for(int i =0; i<n;)
        {
            System.out.println(n-i);
            i++ ;
            while (arr[i]==min)
            {
            	i++ ;
            }
            min= arr[i] ;            
        }
        
        sc.close();
	}

}
