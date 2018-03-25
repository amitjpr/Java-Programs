import java.util.Scanner;
class BellmanFord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of nodes.");
		int n = sc.nextInt();
		System.out.println("Enter source node.");
		int s = sc.nextInt();
		System.out.println("Enter destination node.");
		int d = sc.nextInt();
		int[][] cost = new int[n][n];
		System.out.println("Enter cost adjacency matrix.");
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				cost[i][j] = sc.nextInt();
		int[] prev = new int[n];
		int[] dist = new int[n];
		int max = 9999;
		for(int i=0; i<n; i++)
			dist[i] = max;
		dist[s] = 0;
		
		//relax edges
		int checker=0;
		while(checker!=n-1) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if (cost[i][j]!=0 && dist[i]+cost[i][j]<dist[j]) {
					dist[j] = dist[i] + cost[i][j];
					prev[j] = i;
				}
			}
		}
		checker++;
		}
		//checking for negative weight cycle
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if (cost[i][j]!=0 && dist[i]+cost[i][j]<dist[j]) {
					System.out.println("There is a negative weight cycle.");
					return;
				}
			}
		}
		System.out.println("Minimum cost = " + dist[d]);
		System.out.print("Path: ");
		System.out.print(d + "<<");
		while(d!=s) {
			System.out.print(prev[d] + "<<");
			d = prev[d];
		}
	}
}