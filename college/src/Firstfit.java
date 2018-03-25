import java.util.*;
class Firstfit
{
 public static void main(String args[])
 {
  int n,sum=0,m;
  System.out.println("enter the no. of process here");
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  int process[]=new int[n];
  System.out.println("enter the no. of blocks here");
  m=sc.nextInt();
  int block[]=new int[m];
  System.out.println("enter the process memory required here");
  for(int i=0;i<n;i++)
   process[i]=sc.nextInt();
  System.out.println("enter the avaiable block memory here");
  for(int i=0;i<m;i++)
   block[i]=sc.nextInt();
  for(int i=0;i<n;i++)
  {
   if(process[i]>=0)
   { 
    for(int j=0;j<n;j++)
    {
     if(process[i]<=block[j])
     {
      block[j]-=process[i];
      process[i]=-1;
      break;
     }
    }
   }
  }
  for(int i=0;i<n;i++)
  {
   if(process[i]==-1)
   System.out.println("process "+(i+1)+" completed ");
   else
   System.out.println("process "+(i+1)+" not completed "); 
  }
  for(int i=0;i<m;i++)
  System.out.println(block[i]+" ");
  for(int i=0;i<m;i++)
  sum+=block[i];
  System.out.println("external fgragmentation is "+sum);
 }
}
  
   