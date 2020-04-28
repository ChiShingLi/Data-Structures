public class Main {

    public static void main(String[] args) {

        //testing
        //init LinkedList
        Node testHead = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);

        //init mapping
        testHead.next = nodeB;
        nodeB.next = nodeC;

        LinkedList testingList = new LinkedList();
        testingList.head = testHead;

        //TEST CASE:
        //should be 1 -> 2 -> 3 -> NULL
        System.out.println(testingList);

        //should be 1 -> 2 -> 3 -> 4 -> NULL
        testingList.append(4);
        System.out.println(testingList);

        //should be 5-> 1 -> 2 -> 3 -> 4 -> NULL
        testingList.prepend(5);
        System.out.println(testingList);

        //should be 5-> 1 -> 3 -> 4 -> NULL
        testingList.deleteNode(2);
        System.out.println(testingList);

        //should be 1 -> 3 -> 4 -> NULL
        testingList.deleteNode(5);
        System.out.println(testingList);

    }
}
