import java.util.Scanner;
class Dijkstra {
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
		boolean[] inSet = new boolean[n];
		int[] dist = new int[n];
		int max = 9999;
		for(int i=0; i<n; i++)
			dist[i] = max;
		dist[s] = 0;
		inSet[s] = true;
		int u=s, alt;
		while(true) {
			inSet[u] = true;
			for(int i=0; i<n; i++) {
				//alternative path length
				alt = dist[u]+cost[u][i];
				if(!inSet[i] && cost[u][i]!=0 && alt<dist[i]) {
					dist[i] = alt;
					prev[i] = u;
				}
			}
			if(u==d)
				break;
			u = minDist(n, inSet, dist);
		}
		System.out.println("Minimum cost = " + dist[d]);
		System.out.print("Path: ");
		System.out.print(d + "<<");
		while(d!=s) {
			System.out.print(prev[d] + "<<");
			d = prev[d];
		}
	}

	static int minDist(int n, boolean[] inSet, int[] dist) {
		int vertex = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			if(!inSet[i] && dist[i]<min) {
				min = dist[i];
				vertex = i;
			}
		}
		return vertex;
	}
}