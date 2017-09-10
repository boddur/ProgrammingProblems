import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class CoinChange {
	
	/*
	 * calculate no of ways of representing ncents 
	 * [1,5,10,25]
	 * 
	 * 5+5
	 * 1+1+..1
	 * 5+1+..
	 * 10
	 * nofways =4
	 * 10 -1
	 * 2 10 -1
	 * 5 - 1
	 * 2 5 -1
	 * 3 ,4 
	 * 1 -1
	 * 5 - 2
	 * 
	 */
	static int[] change = {25,10,1};
	static HashMap<String, Integer> hm = new HashMap<>();
	
	public static int coinChange(int n, int denom, int index){
		int noofways =0;
		if(hm.get(n+"-"+denom) != null){
			return hm.get(n+"-"+denom);
		}
		if(n==0){
			return 1;
		}
		if(index==change.length){
			return 0;
		}
		
		for(int i=index;i<change.length;i++){
			if(n-change[i] >= 0){
				noofways+=coinChange(n-change[i], change[i], i );
				hm.put(n-change[i]+"+-+"+change[i], noofways);
			}
			
		}
		
		return noofways;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(coinChange(25, change[0], 0));
	}

}
