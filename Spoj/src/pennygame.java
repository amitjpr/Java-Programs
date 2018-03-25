import java.util.Scanner;

public class pennygame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0 ; i< t ;i++)
		{
			int k=sc.nextInt();
			sc.next();
			String a=sc.nextLine();
			/*int count1=0 , count2=0 ,count3=0 ,count4=0 ,count5=0 ,count6=0 ,count7=0 ,count8=0 ;      
			for(int j=0 ; j<38 ;j++)
			{
				if(a.substring(j, j+3).equals("TTT"))
				{
					count1++;
				}
				if(a.substring(j, j+3).equals("TTH"))
				{
					count2++;
				}
				if(a.substring(j, j+3).equals("THT"))
				{
					count3++;
				}
				if(a.substring(j, j+3).equals("THH"))
				{
					count4++;
				}
				if(a.substring(j, j+3).equals("HTT"))
				{
					count5++;
				}
				if(a.substring(j, j+3).equals("HTH"))
				{
					count6++;
				}
				if(a.substring(j, j+3).equals("HHT"))
				{
					count7++;
				}
				if(a.substring(j, j+3).equals("HHH"))
				{
					count8++;
				}
			}
			System.out.println(k+" "+count1+" "+count2+" "+count3+" "+count4+" "+count5+" "+count6+" "+count7+" "+count8);
			*/
				System.out.print(a);
			
		}
		sc.close();

	}

}
