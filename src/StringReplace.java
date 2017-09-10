import java.util.Arrays;

public class StringReplace {
	
	public static String stringReplace(String str){
		
		char[] chars = str.toCharArray();
		int count =0;
		for(int i=0;i<chars.length;i++){
			if(chars[i] == ' '){
				count++;
			}
		}
		char[] chars1 = new char[chars.length+count*2];
				
				for(int j=chars.length-1;j>=0;j--){
					if(chars[j] == ' ' ){
						count--;
						chars1[j+count*2] = '%';
						chars1[j+count*2+1] ='2';
						chars1[j+count*2+2] = '0';
					}
					else
						chars1[j+count*2] = chars[j];
				}
		return String.valueOf(chars1);
		
	}

	public static void main(String[] args) {
		System.out.println(stringReplace("Abcd ef ghi "));
	}

}
