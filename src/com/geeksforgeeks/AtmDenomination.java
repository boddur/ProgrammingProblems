package com.geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

public class AtmDenomination {
	
	
	public Map<Integer,Integer> getDenominations(int amount){
		HashMap<Integer,Integer> denom= new HashMap<Integer,Integer>();
		if(amount%100  >0 ){
			return  denom;
		}
		int twothousand=0,fivehundred = 0,hundred =0;
		while(amount > 0){
			if(amount-2000 >=0){
				twothousand++;
				amount -=2000;
			}else if(amount-500 >=0){
				fivehundred++;
				amount -=500;
			}else if(amount-100 >=0){
				hundred++;
				amount -=100;
			}
			
		}
		denom.put(2000, twothousand);
		denom.put(500, fivehundred);
		denom.put(100,hundred);
		return denom;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmDenomination atm = new AtmDenomination();
		Map<Integer,Integer> denom = atm.getDenominations(640);
		if(!denom.isEmpty()){
		for(Map.Entry<Integer, Integer> entry:denom.entrySet()){
			System.out.println("Number of "+entry.getKey()+" is "+entry.getValue());
		}
		}else{
			System.out.println("Enter multiples of 100");
		}
		
	}

}
