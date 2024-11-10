

public class BinaryTreesYT {
   static class Node {
       int data;
       Node left;
       Node right;


       Node(int data) {
           this.data = data;
           this.left = null;
           this.right = null;
       }
   }


   static class BinaryTree {
       static int idx = -1;
       public static Node buildTree(int nodes[]) {
           idx++;
           if(nodes[idx] == -1) {
               return null;
           }
           Node newNode = new Node(nodes[idx]); 
           newNode.left = buildTree(nodes);
           newNode.right = buildTree(nodes);
           return newNode;
       }
   }
   static class TreeInfo {
     int ht;
     int diam;
     TreeInfo(int ht, int diam){
       this.ht = ht;
       this.diam = diam;
     }
   }
 public static TreeInfo diameter2(Node root) {
       if(root == null) {
           return new TreeInfo(0, 0);
       }


       TreeInfo leftTI = diameter(root.left);
       TreeInfo rightTI = diameter(root.right);


       int myHeight = Math.max(leftTI.height, rightTI.height) + 1;


       int diam1 = leftTI.height + rightTI.height + 1;
       int diam2 = leftTI.diam;
       int diam3 = rightTI.diam;


       int myDiam = Math.max(diam1, Math.max(diam2, diam3));
       TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
       return myInfo;
   }


   public static void main(String args[]) {
       int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
       BinaryTree tree = new BinaryTree();
      
       Node root = tree.buildTree(nodes);
       System.out.println(diameter(root));
   }
}


