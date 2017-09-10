
import java.io.*;
import java.util.*;

class Reverse {

  static char[] reverseWords(char[] arr) {
    // your code goes here
    int len = arr.length;
    reverse(arr,0, len-1);
    int first= 0;
    for(int k=0;k<len;k++){
      int last =  0;
      if(arr[k] == ' '){
        last = k-1;
        reverse(arr,first, last);
        first=k+1;
      }else if(k == len-1){
    	  last = k;
    	  reverse(arr, first, last);
      }
      
    }
   return arr;
  }
  
  static void reverse(char[] arr, int first, int last) {
    
    while(first<last){
      swap(arr, first, last);
      first++;
      last--;
    }
    
  }
  
  static void swap(char[] arr, int first, int last){
    char t= arr[first];
      arr[first] = arr[last];
      arr[last] = t;
  }

  public static void main(String[] args) {
	 char[] s={'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
    char[] answer = Reverse.reverseWords(s);
    System.out.println(answer);
  }

}