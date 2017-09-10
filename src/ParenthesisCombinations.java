
public class ParenthesisCombinations {
	
	
	/*
	 * {{{}}}
	 */
	public  static void  printValidParanthesis(char[] sb, int l, int r , int count){
		
		if(l<0||r<l){
			return;
		}
		if(l==0 && r==0){
			System.out.println(sb);
		}else{
		
		if(l>0){
			sb[count] = '(';
			printValidParanthesis(sb, l-1,r,count+1);
		}
		
		if(r>l){
			sb[count] = ')';
			printValidParanthesis(sb,l,r-1,count+1);
		}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = new char[6];
		printValidParanthesis(str,3,3,0);
	}

}
