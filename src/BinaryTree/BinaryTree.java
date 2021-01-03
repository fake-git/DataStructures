package BinaryTree;

public class BinaryTree implements Comparable{


    Node root;

    public void add(Object item){

        // if first item
        if(root == null){
            root = new Node();
            root.data = item;
            return;
        }


    }



    @Override
    public int compareTo(Object o) {
        return 0;
    }




}
