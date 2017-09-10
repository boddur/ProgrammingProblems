import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Reverse1 {

  static int[] findDuplicates(int[] arr1, int[] arr2) {
    // your code goes here
    Set<Integer> s = new HashSet<Integer>();
    for(int i=0;i<arr1.length;i++){
      s.add(arr1[i]);
    }
    int size = Math.min(arr1.length, arr2.length);
    int[] res = new int[size];
    int k=0;
    for(int j=0;j<arr2.length;j++){
      if(s.contains(arr2[j]) ){
        res[k] = arr2[j];
        k++;
      }
    }
    int[] result = new int[k];
    for(int i=0;i<k;i++){
    	result[i] = res[i];
    }
    
    return result;
  }

  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 5, 6,7};
    int[] arr2 = {3,6,7,8,20};
    int[] res = findDuplicates(arr1,arr2);
    System.out.println(Arrays.toString(res));
  }

}