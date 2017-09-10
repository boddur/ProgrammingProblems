import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Djikstra {
	
	
	public static class Node{
		int nodeid;
		int weight;
		Node(int id, int wt){
			this.nodeid = id;
			this.weight = wt;
		}
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] shortest = new int[n];
            for(int i=0;i<n;i++){
                shortest[i] = Integer.MAX_VALUE;
            }
            int m = in.nextInt();
            LinkedList<Node>[] adj = new LinkedList[n];
            for(int i=0;i<n;i++){
            	adj[i] = new LinkedList<Node>();
            }
            HashMap<String,Integer> map = new HashMap<String, Integer>();
            for(int a1 = 0; a1 < m; a1++){
                int x = in.nextInt();
                int y = in.nextInt();
                int r = in.nextInt();
                String s= (x<y)?x+"-"+y:y+"-"+x;
                if(map.get(s) != null){
                	if(r<map.get(s)){
                		map.put(s, r);
                		adj[x-1].add(new Djikstra.Node(y,r));
                		adj[y-1].add(new Djikstra.Node(x,r));
                	}
                }else{
                	map.put(s, r);
                	adj[x-1].add(new Node(y,r));
                	adj[y-1].add(new Node(x,r));
                }
                
                
            }
            int s = in.nextInt();
            //System.out.println(Arrays.deepToString(adj));
            shortest[s-1] = 0;
            findShortestPath(s, adj, shortest);
            
        }
    }

	private static void findShortestPath(int s, LinkedList<Node>[] adj, int[] shortest) {
		// TODO Auto-generated method stub
		LinkedList<Integer> que = new LinkedList<Integer>();
		Set<Integer> visited = new HashSet<Integer>();
		Set<Integer> unvisited = new HashSet<Integer>();
		for(int i=0;i<shortest.length;i++){
			unvisited.add(i+1);
		}
		
		int min = Integer.MAX_VALUE;
		int minnode = 0;
		while(visited.size() < shortest.length){

			min = Integer.MAX_VALUE;
			for(int n:unvisited){
				if(min > shortest[n-1]){
					min=shortest[n-1];
					minnode = n;
				}
				
			}
			unvisited.remove(minnode);
			visited.add(minnode);
			for(int j=0;j<adj[minnode-1].size();j++){
				Node node = adj[minnode-1].get(j);
				if(node.weight > 0 ){
				shortest[node.nodeid-1] = Math.min(node.weight+shortest[minnode-1], shortest[node.nodeid-1]);
				}
			}
			
		}
		
		for(int i=0;i<shortest.length;i++){
			if(i != s-1){
			System.out.print((shortest[i] == Integer.MAX_VALUE)?-1:shortest[i]);
			System.out.print(" ");
			}
		}
		System.out.println("");
		
	}

}
