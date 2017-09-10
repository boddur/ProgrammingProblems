import java.io.*;
import java.util.*;

class Solution {
	
  static HashMap<String, String> flattenDictionary(HashMap<String, Object> dict) {
    // your code goes here
    HashMap<String, String> result=
     flattenDictionary("",dict);
    return result;
    
  }
  static HashMap<String,String>  flattenDictionary(String prevKey,HashMap<String, Object> map){
    HashMap<String,String> result = new HashMap<String,String>();
    HashMap<String,String> result1 = new HashMap<String,String>();
    Set<String> keys = map.keySet();
    for(String key: keys){
     
      Object value = map.get(key);
      if(prevKey != "") key = prevKey+"."+key;
      if(value instanceof String){
        result.put(key, (String)value);
      }else{
         result1 = flattenDictionary(key, (HashMap<String, Object>) value);
      }
      
      
    }
    result.putAll(result1);
    return result;
    
  }
  

  public static void main(String[] args) {
	  HashMap<String, Object> map2 = new HashMap<String, Object>();
		 map2.put("d","3");
		 map2.put("e", "1");
	  HashMap<String, Object> map1 = new HashMap<String, Object>();
		 map1.put("a", "2");
		 map1.put("b", "3");
		 map1.put("c", map2);
		
	 HashMap<String, Object> map = new HashMap<String, Object>();
	 map.put("Key1", "1");
	 map.put("Key2",map1);
	 HashMap<String, String> result = flattenDictionary(map);
	 System.out.println(result.toString());
	 
  }

}