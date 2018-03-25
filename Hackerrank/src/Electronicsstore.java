import java.util.*;


public class Electronicsstore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        Arrays.sort(keyboards);
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        Arrays.sort(drives);
        int max=0 , sum=0 ;
        for(int i=0 ;i<n ; i++)
        {
        	for(int j=0 ; j<m ; j++)
        	{
        		sum=keyboards[i]+drives[j];
        		if(sum<=s && sum>max)
        			max=sum ;
        	}
        }
        if(max==0)
        	System.out.println(-1);
        else if(max>0)
        	System.out.println(max);
        in.close();
    }
}
