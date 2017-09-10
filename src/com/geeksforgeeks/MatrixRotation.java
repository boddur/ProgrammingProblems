package com.geeksforgeeks;

public class MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] mat = new int[6][6];
		int k=0;
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				mat[i][j] = k;
				k++;
			}
		}
		MatrixRotation matr = new MatrixRotation();
		matr.printMatrix(mat);
		mat = matr.rotate90(mat);
		matr.printMatrix(mat);

	}
	
	public int[][] rotate90(int [][]arr){
		int lastrow = arr.length-1;
		int lastcol = arr[0].length-1;
		int layer =0;
		for(int row = layer;row < arr.length-layer-1;row++,layer++){
			for(int col = layer; col < arr[0].length-layer-1;col++){
				int tmp = arr[col][lastrow-row];
				arr[col][lastrow-row] = arr[row][col];
				
				arr[row][col] = arr[lastcol-col][row];
				
				arr[lastcol-col][row] = arr[lastrow-row][lastcol-col];
				
				arr[lastrow-row][lastcol-col] = tmp;
				
				
			}
		}
		return arr;
	}
	
	public void printMatrix(int[][] mat){
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
}





