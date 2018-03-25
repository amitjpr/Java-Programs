import java.util.Scanner;

public class ques_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0 ; i<t ;i++)
        {
        	int n=sc.nextInt();
        	int arr[]=new int[n];
        	int arr1[]=new int[n];
        	int arr2[]=new int[n];
        	int temp=0;
        	int max=Integer.MIN_VALUE;
        	for(int k=0; k<n;k++)
        	{
        		arr[k]=sc.nextInt();
        	}
        	for(int k=0;k<n ;k++)
        	{
        		arr1[k]=sc.nextInt();
        		temp=arr[k]%arr1[k];
        		arr2[temp]++;
        		if(temp>max)
        			max=temp;
        	}
        	for(int k=0 ; k<=max ; k++ )
        	{
        		
        	}
        	
        }
	}

}
