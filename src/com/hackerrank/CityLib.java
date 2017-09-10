package com.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class CityLib {
	
	    public class GraphNode{
	        public int data;
	        public ArrayList<GraphNode> neighbors;
	        boolean visited;
	        int cost;
	        
	        public GraphNode(int data, int cost){
	            this.data = data;
	            this.neighbors = new ArrayList();
	            this.visited = false;
	            this.cost =cost;
	        }
	        public int dfs(){
	        	int totalcost = 0;
	            if(this.neighbors != null && !this.visited){
	            	this.visited = true;
	                for(GraphNode neighbor: this.neighbors){
	                	if(!neighbor.visited)
	                		totalcost = neighbor.dfs()+this.cost;
	                }
	                
	            }else{
	                return 0;
	            }
	            return totalcost;
	        }
	        
	    }
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        int cost = 0;
	        for(int a0 = 0; a0 < q; a0++){
	            int n = in.nextInt();
	            int m = in.nextInt();
	            int x = in.nextInt();
	            int y = in.nextInt();
	           
	            int mincost = 0;
	            if(x <= y){
	                System.out.println(x*n);
	                continue;
	                
	            }else{
	            	CityLib.GraphNode[] graph = new CityLib.GraphNode[n];
	                GraphNode graphnode1;
	                GraphNode graphnode2;
	                 for(int a1 = 0; a1 < m; a1++){
	                    int city_1 = in.nextInt();
	                    int city_2 = in.nextInt();
	                     if(graph[city_1-1] == null){
	                         graphnode1 = new CityLib().new GraphNode(city_1,y);
	                         graph[city_1-1] = graphnode1;
	                         
	                     }else{
	                         graphnode1 = graph[city_1-1];
	                     }
	                     if(graph[city_2-1] == null){
	                        graphnode2 = new CityLib().new GraphNode(city_2,y);
	                         graph[city_2-1] = graphnode2;
	                     }else{
	                         graphnode2 = graph[city_2-1];
	                     }
	                    
	                     graphnode1.neighbors.add(graphnode2);
	                     graphnode2.neighbors.add(graphnode1);
	                     
	                   }
	                
	                for(GraphNode graphnode: graph){
	                    int costdfs= graphnode.dfs();
	                    if(costdfs != 0){
	                    	cost += costdfs+x;
	                    }
	                }
	                System.out.println(cost);
	                continue;
	            }
	        }
	    }
	


}
