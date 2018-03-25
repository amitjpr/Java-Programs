import java.util.Arrays;
import java.util.Scanner;

public class sherlock_and_the_valid_string {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int arr[]=new int[26];
      for(int i=0 ; i<s.length();i++)
      {
    	  int k=(int)s.charAt(i)-97 ;
    	  arr[k]++;
      }
      
     
	}

}
