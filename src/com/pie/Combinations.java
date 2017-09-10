package com.pie;

public class Combinations {
	/*
	 * abc
	 * a
	 * ab
	 * abc
	 * b
	 * bc
	 * c
	 */
	
	private StringBuffer sb = new StringBuffer();
	
	public void printCombinations(String str, int index){
		
		
		
		for(int i=index;i<str.length();i++){
			
			sb.append(str.charAt(i));
			System.out.println(sb);
			if(i < str.length()-1){
				sb.setLength(sb.length()+1);
			}
			if(i==str.length()-1){
				sb = new StringBuffer();
				printCombinations(str, index+1);
			}
			
		}
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abcd";
		Combinations com = new Combinations();
		com.printCombinations(str, 0);
	}

}
