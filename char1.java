
import java.util.*;

public class  char1{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String s=str.substring(0,2);
    int a=Integer.parseInt(s);
    int b=a+12;
    System.out.print(b);
    sc.close();
    }
}