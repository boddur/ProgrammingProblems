package com.geeksforgeeks;

import java.util.LinkedList;
import java.util.Scanner;

	class NextLargetElement {
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			for(int y=0;y<t;y++){
			    int n = sc.nextInt();
			    int[] arr = new int[n];
			    for(int k=0;k<n;k++){
			        arr[k] = sc.nextInt();
			    }
			    
			    LinkedList<Integer> stack = new LinkedList<Integer>();
			    stack.push(arr[0]);
			    int i=1;
			    for( i=1;i<arr.length ;i++){
			        
			        if(!stack.isEmpty()){
			        	int element = stack.removeFirst();
			            while(element < arr[i]){
			                System.out.print(arr[i]+" ");
			                if (stack.isEmpty())
		                        break;
		                    element = stack.pop();
			            }
			            if(element > arr[i]){
			            	stack.addFirst(element);
			                
			            }
			        }
			        stack.addFirst(arr[i]);
			        
			        
			    }
			    while(!stack.isEmpty()){
			        stack.remove();
			        System.out.print("-1 ");
			    }
			    
			}
		}
			    
			   
	}
