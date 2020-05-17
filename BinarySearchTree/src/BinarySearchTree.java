public class BinarySearchTree {

    public class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    public void insert(int item) {
        insertHelper(root, item);
    }


    private void insertHelper(Node node, int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        if (value < node.data) {
            if (node.left == null) {
                node.left = new Node(value);
            } else {
                //keep looping thru. the left child node, until its empty
                insertHelper(node.left, value);
            }
        } else {
            //the value is greater, insert to the right
            if (value > node.data) {
                if (node.right == null) {
                    node.right = new Node(value);
                } else {
                    insertHelper(node.right, value); //move to its right child node, until its empty
                }
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) {
            return false;
        } else {

            //start from the root
            return containsHelper(root, value);
        }
    }

    private boolean containsHelper(Node node, int value) {
        if (value == node.data) {
            return true;
        }

        //search the tree
        if (value < node.data && node.left != null) {
            //check the next left child
            return containsHelper(node.left, value);
        } else if (node.right != null) {
            //check the next right child
            return containsHelper(node.right, value);
        }

        return false;
    }

    public void printInOrder() {
        printInOrderHelper(root);
    }

    public void printInOrderHelper(Node node) {
        //print the left child -> parent - > right child
        if (node.left != null) {
            //keep going thru the left child
            printInOrderHelper(node.left);
        }
        System.out.println(node.data);
        if (node.right != null) {
            printInOrderHelper(node.right);
        }
    }

    public void delete(int value) {
        //BASE CASE: if there's no node = no tree
        if (contains(value)) {
            if (root == null) {
                return;
            }
            deleteHelper(root, value);
        }

    }

    int minValue(Node root) {
        int minNumber = root.data;
        //keep searching the min number in the left subtree
        while (root.left != null) {
            minNumber = root.left.data;
            root = root.left; //keep traversal to the next left subtree to find the minimum value
        }
        //return back minNumber
        return minNumber;
    }


    public Node deleteHelper(Node node, int value) {
        //save the next left node in variable
        if (value < node.data) {
            node.left = deleteHelper(node.left, value);
        } else if (value > node.data) { //save the next right node in a variable
            node.right = deleteHelper(node.right, value);
        }

        //else, we found the node to be deleted
        else {

            //CASES:
            //if it have 0 or 1 child
            if (node.left == null) {
                return node.right; //return the right subtree & keep checking
            } else if (node.right == null) {
                return node.left; //return the left subtree
            }

            //if the node have 2 children
            if (node.left != null & node.right != null) {

                //find the min node from the right subtree
                node.data = minValue(node.right);

                //delete the inorder successor
                node.right = deleteHelper(node.right, node.data);
            }
        }
        return node;
    }


}



