
public class InorderSuccessor {
	
	public static class Node{
		int data;
		Node left, right;
		public Node(int value, Node left, Node right){
			this.data= value;
			this.left = left;
			this.right = right;
		}
	}
	public void inorderSuccessor(Node root, Node node ){
		Node next = null;

		Node parent = findNode(root, node);
			
				if(node.right != null){
						next = node.right;
						while(next.left != null){
							next = next.left;
						}
						System.out.println(next.data);
						return;
				}else{
					
							while(parent != null){
								next = findNode(root, parent);
								if(next == null){
									System.out.println("No Successor");
									return;
								}
								if(next.left == parent){
								System.out.println(next.data);
								return;
								}else{
									parent = next;
								}
							}
							
				}
				
		
	}
	
	

	private Node findNode(Node root, Node node) {
		
		if(root == null){
			return null;
		}
		Node parent = null;
		Node tmp = root;
		while(tmp != null){
			if(node.data < tmp.data){
				parent = tmp;
				tmp = tmp.left;
			}else if (node.data > tmp.data){
				parent = tmp;
				tmp = tmp.right;
			}else{
				return parent;
			}
			
		}
		return null;
	}



	public static void main(String[] args) {
		InorderSuccessor inorder = new InorderSuccessor();
		InorderSuccessor.Node node1 = new InorderSuccessor.Node(1, null, null);
		InorderSuccessor.Node node2 = new InorderSuccessor.Node(2, node1, null);
		InorderSuccessor.Node node4 = new InorderSuccessor.Node(4, null, null);
		InorderSuccessor.Node node3 = new InorderSuccessor.Node(3, node2, node4);
		InorderSuccessor.Node node9 = new InorderSuccessor.Node(9, null, null);
		InorderSuccessor.Node node6 = new InorderSuccessor.Node(6, null, null);
		InorderSuccessor.Node node8 = new InorderSuccessor.Node(8, null, node9);
		InorderSuccessor.Node node7 = new InorderSuccessor.Node(7, node6, node8);
		InorderSuccessor.Node root = new InorderSuccessor.Node(5, node3, node7);
		inorder.inorderSuccessor(root, root);

	}

}
