package inordertraversal;

public class Binarytree {
	//根节点
   private Node root; 
   //添加节点
   public void addNode(Comparable data){
	   if(root == null){
		   root = new Node(data);
	   }else{
		   root.add(data);
	   }
	  }
   //输出所有节点
   public void printNode(){
	   if(root!=null){
		   root.printNode();
	   }
   }
   class Node{
	   //节点对象
	   private Comparable data;//节点数据
	   private Node left;//左节点
	   private Node right;//右节点
	   public Node(Comparable data){
		   this.data = data;
		   }
	   //添加节点
	   public void add(Comparable data){
		   if(this.data.compareTo(data)>0){
			   if(this.left==null){
				   this.left = new Node(data);}
				   else{
					   this.left.add(data);
				   }
			   }
		   else{
               if(this.right==null){
            	   this.right=new Node(data);}
               else{
            	   this.right.add(data);
               }
               }
	   }
	   
	   //输出节点
	   public void printNode(){
		   if (this.left!=null){
			   this.left.printNode();
		   }
		   System.out.println(this.data);
		   if (this.right!=null){
               this.right.printNode();
	       }
       }
   }
   
   public static void main(String[]args){
	   Binarytree bt = new Binarytree();
	   bt.addNode(10);
	   bt.addNode(11);
	   bt.addNode(5);
	   bt.addNode(7);
	   bt.addNode(2);
	   bt.addNode(4);
   }
} 



	
