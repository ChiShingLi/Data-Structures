//useful in priority queue
//used in when you need quick access to the smallest/largest item because item always at the top
//However, the remainder of the array is kept partially unsorted
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
        myMaxHeap.printHeap(); // 40, 30 , 15, 10, 20
        System.out.println();

        myMaxHeap.delete();
        System.out.print("After delete: ");
        myMaxHeap.printHeap(); // 30, 20, 15, 10

        myMaxHeap.delete();
        System.out.print("After delete: ");
        myMaxHeap.printHeap(); // 20, 10, 15

        myMaxHeap.delete();
        System.out.print("After delete: ");
        myMaxHeap.printHeap(); // 20, 10

        myMaxHeap.delete();
        System.out.print("After delete: ");
        myMaxHeap.printHeap(); // 10

        myMaxHeap.delete();
        System.out.print("After delete: ");
        myMaxHeap.printHeap(); // EMPTY

        //at this point the heap is sorted in increasing order (HEAP SORT)
        System.out.println("-----");



        MinHeap myMinHeap = new MinHeap(10);
        myMinHeap.insert(10);
        myMinHeap.insert(20);
        myMinHeap.insert(15);
        myMinHeap.insert(30);
        myMinHeap.insert(40);

        System.out.println("First element in min heap: " + myMinHeap.peek()); // 10
        System.out.print("Min Heap: ");
        myMinHeap.printHeap(); // 10, 20, 15, 30, 40
        System.out.println();
        System.out.println("-----");

        myMinHeap.delete();
        System.out.print("After delete: ");
        myMinHeap.printHeap(); // 30, 20, 15, 10

        myMinHeap.delete();
        System.out.print("After delete: ");
        myMinHeap.printHeap(); // 20, 10, 15

        myMinHeap.delete();
        System.out.print("After delete: ");
        myMinHeap.printHeap();

        myMinHeap.delete();
        System.out.print("After delete: ");
        myMinHeap.printHeap();

        myMinHeap.delete();
        System.out.print("After delete: ");
        myMinHeap.printHeap();

        //at this point the heap is sorted in decreasing order (HEAP SORT)
        System.out.println("-----");


    }


}
