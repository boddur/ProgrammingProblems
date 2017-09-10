import java.io.*;
import java.util.*;


class Pramp {

  static int[] sortKMessedArray(int[] arr, int k) {
    // your code goes here
	 int[] sortedarr = new int[arr.length];
    for(int i=0;i<arr.length-k;i++){
      int minIndex = i;
      for(int j=i-k;j<i+k && j>0;j++){
        if(arr[minIndex] >arr[j] ){
          minIndex=j;
          
        }
        
      }
      sortedarr[i] = arr[minIndex];
    }
      
    
    return sortedarr;
  }
 

  public static void main(String[] args) {
    int[] arr = {1, 4, 5, 2, 3, 7, 8, 6, 10, 9};
    int[] sortedarr = sortKMessedArray(arr, 2);
    System.out.println(Arrays.toString(sortedarr));

  }

}