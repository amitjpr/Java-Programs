import java.util.Scanner;

public class snakeandmongoose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine() ;
        for(int i=0 ; i< t ; i++)
        {   
        	String s=sc.nextLine();
        	char ch[]=s.toCharArray() ;
        	int cs=0 , cm=0 ;
        	for(int j=0 ; j <s.length() ;j++)
        	{
        		if(ch[j]=='s')
        			cs++;
        		else if (ch[j]=='m' && j==0 )
        		{
        			if(ch[j+1]=='s')
        				{ ch[j+1]= 'a'; 
        				  cs--;
        				}
        			cm++ ;
        		}
        		else if(ch[j]=='m' && j< (s.length()-1) )
        				{
        			        if(ch[j+1]=='s')
        			        {   
        			        	ch[j+1]='a';
        			        	cs-- ;
        			        }
        			        else if (ch[j+1]!='s' && ch[j-1]!='s')
        			        	cm++ ;
        			        else  
        			        {   
        			        	ch[j-1]='a';
        			        	cs-- ;
        			        }
        			        
        				}
        		else if(ch[j]=='m' && j==(s.length()-1))
        		{
        			 if(ch[j-1]=='s' && j>0)
 			        {
 			        	cs-- ;
 			        }
 			        cm++ ;
        		}
        		
        	}
        	if(cm>cs)
    		{
    			System.out.println("mongooses");
    		}
    		else if(cm==cs)
    			System.out.println("tie");
    		else 
    		   System.out.println("snakes");
        }
		sc.close();
	}

}
