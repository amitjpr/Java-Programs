import java.util.Scanner;

public class beautiful_binary_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		int count=0;
		for(int i=3 ;i<=n ;i++)
		{    String str=s.substring(0,i);
		//System.out.println(str+"  "+count);
						if(str.contains("010")==true)
			{
				str=str.replace("010","011");
				count++;
			}
		    //System.out.println(str+"  "+count);
			s=str+s.substring(i);
		}
        System.out.print(count);
	}

}
