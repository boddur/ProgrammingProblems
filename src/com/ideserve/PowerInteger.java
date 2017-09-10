package com.ideserve;

import java.util.Scanner;

public class PowerInteger {
	
	public boolean powerOfInt(int n){
		int i=2;
		
		for(int tmp =n;i<=(int)Math.sqrt(n);i++){
			while(tmp > 1){
				if(tmp%i == 0){
					tmp /= i;
				}else{
					tmp = n;
					break;
				}
				
			}
			if(tmp ==1){
				return true;
			}
			
		}
		if(i > (int)Math.sqrt(n))
			return false;
		else
			return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PowerInteger pow = new PowerInteger();
		System.out.println(pow.powerOfInt(n));
	}

}
