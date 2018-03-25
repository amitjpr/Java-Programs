import java.util.Scanner; //Scanner Function to take in the Input Values

 class Dijkstra
{
    static Scanner scan; // scan is a Scanner Object

    public static void main(String[] args)
    {	int n=0;
    	 scan = new Scanner(System.in);
    	System.out.println("enter the no. of vertices");
    	n=scan.nextInt();
        int[] p = new int[n+1];
        int min = 999, nextNode = 0; // min holds the minimum value, nextNode holds the value for the next node.
        int[] d = new int[n+1]; // the distance matrix
        int[][] matrix = new int[n+1][n+1]; // the actual matrix
        int[] visited = new int[n+1]; // the visited array

        System.out.println("Enter the cost matrix");

        for (int i = 1; i < d.length; i++)
        {
            visited[i] = 0; //initialize visited array to zeros
            p[i] = 0;

            for (int j = 1; j < d.length; j++)
            {
				 matrix[i][j] = scan.nextInt(); //fill the matrix
                if (matrix[i][j]==0)
                    matrix[i][j] = 999; // make the zeros as 999
            }
        }

        d = matrix[1]; //initialize the distance array
        visited[1] = 1; //set the source node as visited
        d[1] = 0; //set the distance from source to source to zero which is the starting point

	  for (int i = 2; i <= n; i++){
	  	d[i]=matrix[1][i];
	  }

        for (int counter = 1; counter <= n; counter++)
        {
            min = 999;
            for (int i = 1; i <= n; i++)
            {
                if (min > d[i] && visited[i]!=1)
                {
                    min = d[i];
                    nextNode = i;
                }
            }

            visited[nextNode] = 1;
            for (int i = 1; i <= n; i++)
            {
                if (visited[i]!=1)
                {
                    if (min+matrix[nextNode][i] < d[i])
                    {
                        d[i] = min+matrix[nextNode][i];
                        p[i] = nextNode;

                    }

                }

            }

        }

        for(int i = 1; i <= n; i++)
            System.out.print("   " + d[i]);



        int j;
        for (int i = 1; i <= n; i++)
        {
            if (i!=1)
            {

                System.out.print("Path is = " + i);
                j = i;
                do
                {
                    j = p[j];
                    System.out.print(" to " + j);
                }
                while(j != 0);
            }
            System.out.println();
        }
    }
}
