import java.io.*;
import java.util.*;

class DifferenceK {

  static int[][] findPairsWithGivenDifference(int[] arr, int k) {
    // your code goes here
    Arrays.sort(arr);
    int low= 0;
    int high = 1;
    ArrayList<int[]> out = new ArrayList<int[]>();
    while(low < arr.length-1 && high < arr.length){
      
      if(arr[high]-arr[low] > k){
        low++;        
      }else if(arr[high]-arr[low] <k){
        high++;
      }else if(arr[high]-arr[low] == k){
        int[] a = {arr[low], arr[high]};
        out.add(a);
        low++;
        high++;
      }
      
    }
    int[][] result = new int[out.size()][2];
    for(int i=0;i<out.size();i++){
      int[] res = out.get(i);
      for(int j=0;j<2;j++){
        result[i][j] = res[j];
      }
      
    }
    return result;
  }

  public static void main(String[] args) {
	  int[] arr = {-1,1,0,2,3,4};
	  System.out.println(Arrays.deepToString(findPairsWithGivenDifference(arr, 2)));
  }

}