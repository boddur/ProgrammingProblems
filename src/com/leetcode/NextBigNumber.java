package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class NextBigNumber {
	    public long nextGreaterElement(int n) {
	        int length = findDigits(n);
	        String s = Integer.toString(n);
	        String firstpart = new String();
	        String middlepart = new String();
	        String lastpart = new String();
	        String secpart = new String();
	        StringBuffer nextno = new StringBuffer(Integer.toString(-1));
	        StringBuffer currno = new StringBuffer(Integer.toString(n));
	        for(int i=0;i<length;i++){
	            int currdigit = Integer.parseInt(currno.substring(length-i-1, length-i));
	            if(currdigit >0){
	                for(int j=i+1;j<length;j++){
	                    int nextdigit = Integer.parseInt(currno.substring(length-j-1, length-j));
	                        if(nextdigit < currdigit ){
	                             firstpart=s.substring(0,length-j-1);
	                             if(i+1 < j ){
	                             middlepart = s.substring(length-j,length-i-1);
	                             }
	                             if(i>0){
	                             lastpart = s.substring(length-i);
	                             }
	                             secpart = middlepart+nextdigit+lastpart;
	                             if(!middlepart.isEmpty() || !lastpart.isEmpty()){
		                            char[] chars = secpart.toCharArray();
		                            Arrays.sort(chars);
		                             secpart = new String(chars);
	                             }
	                            nextno = new StringBuffer(firstpart+currdigit+secpart);
	                            return Long.valueOf(nextno.toString());
	                        }
	                    }
	            }
	            
	        }
	            return Long.valueOf(nextno.toString());
	    }
	    
	    public int findDigits(int n){
	        int count =0;
	        while( n>0){
	            n=n/10;
	            count++;
	        }
	        return count;
	        
	    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		NextBigNumber  nbn = new NextBigNumber();
		System.out.println(nbn.nextGreaterElement(n));
		sc.close();
	}

}
