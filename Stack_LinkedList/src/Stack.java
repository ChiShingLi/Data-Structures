/*
    Stack, LinkedList implementation
 */
public class Stack {
    Node top = null;

    public class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
        }
    }

    //add element to the top of the stack
    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            return;
        }
        //set the old top to link to the new top
        newNode.link = top;
        top = newNode;
    }

    //remove element from the top of the stack
    public void pop() {
        if (top == null) {
            return;
        }
        //set the top pointer to the next element
        top = top.link;
    }

    //check and see if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    //get the item at the top
    public int top() {
        return top.data;
    }

    //FOR TESTING
    public String toString() {
        String result = "";
        Node current = top;

        while (current != null) {
            result += String.valueOf(current.data) + " -> ";
            current = current.link;
        }
        result += "NULL";
        return result;
    }


}
