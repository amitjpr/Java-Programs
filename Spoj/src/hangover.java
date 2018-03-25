import java.util.Scanner;

public class hangover {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()==true)
        {
        	float c=sc.nextFloat() ;
        	if(c==0.00)
        	{
        		System.exit(0);
        	}
        	else
        	{
        	float sum=0 ;
        	int count =0 ; 
        	for(float i= 2 ;sum <=c ;i++)
        	{
        		sum=sum+(1/i);
        		count++ ;
        	}
        	System.out.println(count+" card(s)");
            }
        }
		
		
		sc.close();
	}

}
