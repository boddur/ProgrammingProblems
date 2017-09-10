package com.geeksforgeeks;

import java.util.*;
import java.lang.*;
import java.io.*;


public class PrintSpiralMatrix {
	
	    
	    public void printSpiral(int[][] arr){
	        int size = arr.length;
	        int perimeter;
	        for(int layer=0;layer < size/2;layer++){
	            perimeter = 4*size-8*layer-4;
	            int row = layer+1;
	            int col = size-layer-1;
	            for(int j=layer;j<perimeter;j++){
	                if(j<size-layer){
	                    System.out.print(arr[layer][j]+" ");
	                }else if(j>=size-layer && j<perimeter/2){
	                    
	                    System.out.print(arr[row][col]+" ");
	                    row++;
	                }else if(j>=perimeter/2 && j<3*perimeter/4){
	                    
	                    System.out.print(arr[row][col]+" ");
	                    col--;
	                }else if(j>=3*perimeter/4 && j<perimeter){
	                    
	                    System.out.print(arr[row][col]+" ");
	                    row--;
	                }
	            }
	        }
	    }
		public static void main (String[] args) {
			//code
			Scanner sc = new Scanner(System.in);
			int tests = sc.nextInt();
			int[][] a = new int[4][4];
			for(int t = 0; t < tests; t++){
			    for(int i=0;i<4;i++){
			        for(int j=0;j<4;j++){
			            a[i][j] = sc.nextInt();
			        }
			    }
			    PrintSpiralMatrix g = new PrintSpiralMatrix();
			    g.printSpiral(a);
			}
		}
	

}
