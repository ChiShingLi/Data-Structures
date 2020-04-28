public class LinkedList {

    Node head; //head of the node (first node)

    //method for prepend (insert element at the head)
    public void prepend(int data) {
        //if there's no node in LinkedList, create new Node & assign it the head
        if (head == null) {
            head = new Node(data);
            return;
        }

        //else
        Node newHead = new Node(data); //create a new Node
        newHead.next = head;  //assign the new Node's next pointer -> pointing to the old head's.next Node
        head = newHead; //assign new Head
    }


    //method for append node at the end of LinkedList
    public void append(int data) {
        //if we got no node in the list, create a new node and make it the head.
        if (head == null) {
            head = new Node(data); //create a new node & make it the head
            return;
        }

        //starting node pointer, indicate what node that we currently working on
        Node current = head;

        //keep traversing thru. the list
        while (current.next != null) {
            current = current.next;
        }

        //else: the next node is null, so create a new node & append it to the end
        current.next = new Node(data);
    }

    //method for deleting Node in the LinkedList
    public void deleteNode(int dataToDelete) {

        //if head is the node that we wanted to delete
        if (head.data == dataToDelete) {
            head = head.next; //set the head to the next node
            return;
        }
        //else, traversal the list...
        Node current = head;
        while (current.next != null) {
            if (current.next.data == dataToDelete) {
                current.next = current.next.next; //re-map the current Node's next pointer to the next next Node
                return;
            }
            current = current.next; //traversal to next Node and check
        }
    }

    //FOR TESTING PURPOSE:
    // print out all the node's data in the list
    public String toString() {
        String result = "";
        Node current = head;
        while (current.next != null) {
            result += String.valueOf(current.data) + " -> ";
            result += " ";
            current = current.next;
        }
        result += String.valueOf(current.data) + " -> ";
        result += "NULL";
        return result;
    }


}
