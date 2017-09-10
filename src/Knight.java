import java.util.*;
import java.lang.*;
import java.io.*;

class Knight {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int size = sc.nextInt();
		    int posx= sc.nextInt();
		    int posy = sc.nextInt();
		    Coordinate pos = new Coordinate(posx, posy, 0);
		    int targetx = sc.nextInt();
		    int targety = sc.nextInt();
		    Coordinate target = new Coordinate(targetx, targety, 0);
		    System.out.println(minSteps(size, pos, target));
		}
		
		
	}
	static class Coordinate{
	    int row;
	    int col; 
	    int steps;
	    Coordinate(int x, int y ,int steps){
	        this.row = x;
	        this.col = y;
	        this.steps = steps;
	    }
	}
	
	public static int minSteps(int size, Coordinate knight, Coordinate target){
	    
	    int minsteps =0;
	    LinkedList<Coordinate> que = new LinkedList<Coordinate>();
	    que.add(knight);
	    Coordinate pos = null;
	    boolean[][] visit =  new boolean[size+1][size+1];
	    for (int i = 1; i <= size; i++)
	        for (int j = 1; j <= size; j++)
	            visit[i][j] = false;
	    visit[knight.row][knight.col] = true;
	    while(!que.isEmpty()){
	    pos = que.remove();
	    visit[pos.row][pos.col] = true;
	    if(pos.row == target.row && pos.col == target.col){
	        return pos.steps;
	    }
	    minsteps = pos.steps+1;
	    if(pos.row+2 <= size && pos.col+1 <= size && !visit[pos.row+2][pos.col+1]){
	        
	        que.add(new Coordinate(pos.row+2, pos.col+1, minsteps));
	    }
	    if(pos.row+2 <= size && pos.col-1 > 0 && !visit[pos.row+2][pos.col-1]){
	        que.add(new Coordinate(pos.row+2, pos.col-1,minsteps));
	    }
	    if(pos.row-2 > 0 && pos.col+1 <= size && !visit[pos.row-2][pos.col+1]){
	        que.add(new Coordinate(pos.row-2, pos.col+1, minsteps));
	    }
	    if(pos.row-2 > 0 && pos.col-1 >0 && !visit[pos.row-2][pos.col-1]){
	        que.add(new Coordinate(pos.row-2, pos.col-1, minsteps));
	    }
	    if(pos.row-1 > 0 && pos.col-2 > 0 && !visit[pos.row-1][pos.col-2]){
	        que.add(new Coordinate(pos.row-1, pos.col-2, minsteps));
	    }
	    if(pos.row+1 <= size && pos.col-2 > 0 && !visit[pos.row+1][pos.col-2]){
	        que.add(new Coordinate(pos.row+1, pos.col-2, minsteps));
	    }
	    if(pos.row+1 <= size && pos.col+2 <=size && !visit[pos.row+1][pos.col+2]){
	        que.add(new Coordinate(pos.row+1, pos.col+2, minsteps));
	    }
	    if(pos.row-1 > 0 && pos.col+2 <= size && !visit[pos.row-1][pos.col+2]){
	        que.add(new Coordinate(pos.row-1, pos.col+2, minsteps));
	    }
	    }
	  return -1;  
	}
}
