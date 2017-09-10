import java.util.*;
import java.lang.*;
import java.io.*;

class EditDistance {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		   int l1 = sc.nextInt();
		   int l2 = sc.nextInt();
		   sc.nextLine();
		   String s = sc.nextLine();
		   String s1 = s.substring(0,l1);
		   String s2  = s.substring(l1+1);
		    System.out.println(editdistance(s1.toCharArray(), s2.toCharArray()));
		}
	}
	
	public static int editdistance(char[] s1, char[] s2){
	    
	    int[][] arr = new int[s1.length+1][s2.length+1];
	    for(int i=0;i<s1.length+1;i++){
	        arr[i][0] = i;
	        for(int j= 1;j<s2.length+1;j++){
	            if(i==0){
	               arr[0][j] = j; 
	            }else if(s1[i-1] == s2[j-1]){
	                arr[i][j] = arr[i-1][j-1];
	            }else if(s1[i-1]  != s2[j-1]){
	                arr[i][j] = Math.min(Math.min(arr[i-1][j], arr[i][j-1]), arr[i-1][j-1])+1;
	                
	            }
	        } 
	            
	        }
	        return arr[s1.length][s2.length];
	      
	}
	
	
}