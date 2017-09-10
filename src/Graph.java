import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Graph {
	
	int n;//no. of vertices
	LinkedList<Integer>[] adjacent;
	
	public Graph( int n){
		this.n = n;
		this.adjacent = new LinkedList[n];
		for(int i=0;i<n;i++){
			adjacent[i] = new LinkedList<Integer>();
		}
		
	}
	
	public void addEdge(int s, int t){
		adjacent[s].add(t);
	}
	
	public void dfs(int s, int t){
		
		Set<Integer> visited= new HashSet<Integer>();
		dfsUtil(s,t,visited);
		
		
	}

	private void dfsUtil(int s, int t, Set<Integer> visited) {
		
		if(s == t){
			System.out.print(t);
			return;
		}
		
		visited.add(s);
		for(int c:adjacent[s]){
			if(!visited.contains(c)){
				dfsUtil(c, t, visited);
				System.out.print("<----"+s);
				break;
			}
			
			
		}

		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  1---> 2--->3 
		 *  \
		 *  \3
		 *  
		 *  
		*/
		Graph g = new Graph(6);
		g.addEdge(1, 3);
		g.addEdge(1, 2);
		g.addEdge(2,4);
		g.addEdge(3,4);
		g.addEdge(4,5);
		g.addEdge(0,1);
		g.dfs(2,5);

	}

}
