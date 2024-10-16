public class BST {

static class Node {


    int data;
    Node left;
    Node right;
    
Node(int data){
    this.data = data;

}
}

public static Node insert(Node root , int value){

if(root == null){

    root = new Node(value);
    return root;
}

if(root.data > value){

  root.left = insert(root.left, value);
}

else{

    root.right = insert(root.right, value);
}
return root;

}

// inorder method return  sorted list

public static void inorder(Node root){

if(root == null){
    return;
}

inorder(root.left);
System.out.print(root.data + " ");
inorder(root.right);

}

public static boolean search(Node root, int key){

if(root == null){
    return false;
}

 
if(root.data == key){
    return true;
}

if(root.data > key){  // left subtree
return search(root.left, key);

} 


if(root.data < key){

    return search(root.right , key);
}

return false;

}


public static Node delete(Node root, int value){

if(root.data > value){

    root.left =  delete(root.left, value);
}

else if(root.data < value){

    root.right = delete(root.right, value);
}

else{  // root.data == value

    // case 1

    if(root.left == null && root.right == null){
     return null;


    }


    //case 2


    if(root.left == null){

        return root.right;
    }
    else if( root.right == null){

        return root.right;
    }
   
}

  return root;

}




    public static void main(String[] args) {
        int value[] = {5,1,3,4,2,7};

        Node root = null;

        for (int i = 0; i < value.length; i++) {
            
            root = insert(root, value[i]);
        }
    
     inorder(root);
     System.out.println();


     if(search(root, 3)){

        System.out.println("found");
     }
     else{
        System.out.println("not found");
     }
   


   
     inorder(root);
    //  delete(root, 3);



    }
}