package com.pie;

public class Permutations {
	
	/*
	 * abc
	 * acb
	 * bca
	 * bac
	 * cab
	 * cba
	 */
	
	StringBuilder sb = new StringBuilder();

	String str = new String();
	boolean[] used;
	public Permutations(String str){
		this.str = str;
		this.used = new boolean[str.length()];;
	}
	
	public void printPermutations(){
		if(sb.length() == str.length()){
			System.out.println(sb);
		}
		for(int i=0;i<str.length();i++){
			if(!used[i]){
				used[i] =true;
				
			}else{
				continue;
			}
			sb.append(str.charAt(i));
			printPermutations();
			sb.setLength(sb.length()-1);
			used[i] = false;
			
			
		}
		
	}
	
	public static void main(String[] args){
		
		Permutations perm = new Permutations("abcd");
		perm.printPermutations();
	}

}
