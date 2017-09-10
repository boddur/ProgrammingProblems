package com.geeksforgeeks;

public class LinkedlistRev {
	
	class LLNode{
		int value;
		LLNode next;
		
		public LLNode(int n){
			this.value = n;
			this.next = null;
		}
		public void printLL(LLNode first){
			LLNode node = first;
			while(node.next != null){
				System.out.print(node.value+"-->");
				node = node.next;
			}
			System.out.println(node.value);
		}
		
		LLNode revTwo(LLNode first){
			
			if(first == null || first.next == null){
				return first;
			}
			LLNode node = first;
			LLNode newFirst = first.next;

			LLNode prevNode = node;
			while(node.next != null){
				LLNode tmp = node.next.next;
				node.next.next = node;
				
				prevNode.next = node.next;
				node.next = tmp;
				prevNode  = node;
				node = tmp;
			}
			
			return newFirst;
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedlistRev.LLNode first = new LinkedlistRev().new LLNode(1);
		first.next = new LinkedlistRev().new LLNode(2);
		first.next.next = new LinkedlistRev().new LLNode(3);
		first.next.next.next = new LinkedlistRev().new LLNode(4);
		first.next.next.next.next = new LinkedlistRev().new LLNode(5);
		first.printLL(first);
		LLNode newFirst = first.revTwo(first);
		first.printLL(newFirst);

	}

}
