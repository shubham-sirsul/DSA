public class DeleteNode {
    public static class Node{
     int data;
     Node left;
      Node right;
      public Node(int data){
          this.data = data;
      }
     }
     public static void  deleteNode(Node root, int val){
        if(root==null) return;
        if(root.data==val){
         if(root.left==null && root.right!=null){
            Node x = root;
            root=root.left;
            x=null;
         }else if(root.left!=null && root.right==null){
            Node x = root;
            root=root.right;
            x=null;
         }
         else {
            Node l =root.left;
             Node curr = l;
               Node pred= l.left;
               if(pred.right==null){
                  root.left=pred;
                  pred.right= l.right;
                  return;
               }
               while(pred.right!=null){
                  curr=pred;
                  pred=pred.right;
               }
               if(pred.left!=null){
                  curr.right= pred.left;
               }
               if(pred.left==null){
                  curr.right=null;
               }
               l.data= pred.data;

         } 
        }
         
         if(val<root.data){
            if(root.left==null) return;
            if(root.left.data==val){
               Node l= root.left;
               if(l.right==null && l.left==null ){ // for 0 childern 
                root.left=null;
               }
               else if(l.left==null || l.right==null){// for 1 child 
                  if(l.left!=null){
                    root.left= l.left;
                  }
                  else{
                    
                    root.left= l.right;
                  
                  }

               }
               else{ // for 2 child
               Node curr = l;
               Node pred= l.left;
               if(pred.right==null){
                  root.left=pred;
                  pred.right= l.right;
                  return;
               }
               while(pred.right!=null){
                  curr=pred;
                  pred=pred.right;
               }
               if(pred.left!=null){
                  curr.right= pred.left;
               }
               if(pred.left==null){
                  curr.right=null;
               }
               l.data= pred.data;// replaces data of node that want to delete with inorder predesesor 
               }
            }
            else deleteNode(root.left, val);
         }
          else{
             if(root.right==null) return;
            if(root.right.data==val){
                Node l= root.right;
               if(l.right==null && l.left==null ){ // for 0 childern 
                root.right=null;
               }
               else if(l.left==null || l.right==null){// for 1 child 
                  if(l.left!=null){
                    root.right= l.left;
                  }
                  else{
                    root.right= l.right;
                  }
               }
               else{ // for 2 child
                   Node curr = l;
               Node suc= l.left;
               if(suc.right==null){
                  root.left=suc;
                  suc.right= l.right;
                  return;
               }
               while(suc.right!=null){
                  curr=suc;
                  suc=suc.right;
               }
               if(suc.left!=null){
                  curr.right= suc.left;
               }
               if(suc.left==null){
                  curr.right=null;
               }
               l.data= suc.data;// replaces data of node that want to delete with inorder
               }
            }
            else deleteNode(root.right, val);
         }
        
     }
    public static void main(String[] args) {
        
    }
}