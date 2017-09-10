package com.geeksforgeeks;

import java.math.BigInteger;

public class Powerofx {
	
	
	double getPower(int x, int y){
		double pow = 1;
		int mody =y;
		if(y <0)
			mody=-1*y;
		while(mody > 0){
			
			if(mody%2 > 0){
				pow *= x;
			}
			x=x*x;
			mody=mody>>1;
			
		}
		if(y<0)
			pow = 1/pow;
		return pow;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Powerofx p = new Powerofx();
		System.out.println(p.getPower(2,-3));
	
	}

}
