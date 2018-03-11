import java.util.*;
public class Weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
		  int a = scan.nextInt();
          double b=scan.nextDouble();
          String c ;
            scan.nextLine();
          c=scan.nextLine();

      /* Read and save an integer, double, and String to your variables.*/

      /* Print the sum of both integer variables on a new line. */
             System.out.println(a+i);
      /* Print the sum of the double variables on a new line. */
		       
            System.out.printf("%.1f",(d+b));    
      /* Concatenate and print the String variables on a new line; 
      	the 's' variable above should be printed first. */
            System.out.println();
            
            System.out.println(s+c);
          scan.close();
	}

}
