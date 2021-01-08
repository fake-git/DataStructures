package BinaryTree;

import java.util.Comparator;

public class BinaryTree{

    Node root;

    public void add(Double item) throws BinaryTreeAlreadyHasAnItemWithTheSameSortingOrderException {

        // if first item
        if(root == null){
            root = new Node();
            root.Data = item;
            return;
        }

        Node current = root;
        int comparisonResult;


        while (true)
        {

            comparisonResult = current.Data.compareTo(item);

            if(comparisonResult == 0)
                throw new BinaryTreeAlreadyHasAnItemWithTheSameSortingOrderException();

            // add to right
            if(comparisonResult < 0){

                if(current.Right == null){
                    current.Right = new Node();
                    current.Right.Data = item;
                    return;
                }
                current = current.Right;
            }

            // add to left
            if(comparisonResult > 0){

                if(current.Left == null){
                    current.Left = new Node();
                    current.Left.Data = item;
                    return;
                }
                current = current.Left;
            }
        }
    }



    public boolean contains(Double item){

        // empty tree
        if(root == null)
            return false;

        Node current = root;
        int comparisonResult;

        while (true)
        {
            comparisonResult = current.Data.compareTo(item);

            if(comparisonResult == 0)
                return true;

            // Right
            if(comparisonResult < 0)
            {
                if(current.Right == null)
                    return false;
                current = current.Right;
            }

            // Left
            if(comparisonResult > 0)
            {
                if(current.Left == null)
                    return false;
                current = current.Left;
            }
        }
    }





}

