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
        int comparableResult;


        while (true)
        {

            comparableResult = current.Data.compareTo(item);

            if(comparableResult == 0)
                throw new BinaryTreeAlreadyHasAnItemWithTheSameSortingOrderException();

            // add to right
            if(comparableResult < 0){

                if(current.Right == null){
                    current.Right = new Node();
                    current.Right.Data = item;
                    return;
                }
                current = current.Right;
            }

            // add to left
            if(comparableResult > 0){

                if(current.Left == null){
                    current.Left = new Node();
                    current.Left.Data = item;
                    return;
                }
                current = current.Left;
            }
        }
    }







}

