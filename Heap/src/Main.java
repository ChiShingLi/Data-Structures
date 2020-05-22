public class Main {
    public static void main(String[] args) {

        //TEST CASES:
        MaxHeap myMaxHeap = new MaxHeap(10);
        myMaxHeap.insert(10);
        myMaxHeap.insert(20);
        myMaxHeap.insert(15);
        myMaxHeap.insert(30);
        myMaxHeap.insert(40);

        System.out.println("First element in max heap: " + myMaxHeap.peek()); // 40
        System.out.print("Max Heap: ");
        myMaxHeap.printHeap(); // 40, 30 ,15, 10, 20
        System.out.println();

        MinHeap myMinHeap = new MinHeap(10);
        myMinHeap.insert(10);
        myMinHeap.insert(20);
        myMinHeap.insert(15);
        myMinHeap.insert(30);
        myMinHeap.insert(40);

        System.out.println("-----");

        System.out.println("First element in min heap: " + myMinHeap.peek()); // 40
        System.out.print("Min Heap: ");
        myMinHeap.printHeap(); // 10, 20, 15, 30, 40
        System.out.println();
    }


}
