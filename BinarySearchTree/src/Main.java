public class Main {

    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

//        myBST.insert(3);
//        myBST.insert(1);
//        myBST.insert(2);
//        myBST.insert(5);
//        myBST.insert(6);
//        System.out.println(myBST.contains(7)); //false
//        //myBST.printInOrder(); //1 -> 2 -> 3 -> 5 -> 6
//
//        myBST.delete(2);
//        myBST.printInOrder();

        myBST.insert(3);
        myBST.insert(1);
        myBST.insert(2);
        myBST.insert(5);
        myBST.insert(9);
        myBST.insert(8);
        myBST.insert(10);

        myBST.delete(9);

        myBST.printInOrder();
        System.out.println("test");

    }

}
