

public class MaxHeap {

    int size;
    int[] array;
    int currentElementIndex; //pointer pointing at where to insert the next item

    public MaxHeap(int size) {
        //start at index 1
        array = new int[size + 1];
        currentElementIndex = 1; //array starts at index1;

    }

    //return the first item in the array (heap)
    public int peek() {
        return array[1];
    }

    //insert item into the heap
    public void insert(int item) {
        if (currentElementIndex > array.length) {
            return;
        }
        array[currentElementIndex] = item;
        heapify();
        currentElementIndex++;
    }

    //swap 2 items in the heap
    public void swap(int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    //move the highest number to the top of the heap
    public void heapify() {
        //temp pointer to the next index after swap
        int curItemIndexTemp = currentElementIndex;

        //while the current inserted element's index, and element is greater than its parent
        while ((curItemIndexTemp / 2) >= 1 && array[curItemIndexTemp] > array[curItemIndexTemp / 2]) {
            swap(curItemIndexTemp, curItemIndexTemp / 2);
            curItemIndexTemp /= 2;
        }
    }

    //print out the heap
    public void printHeap() {
        for (int i = 1; i < currentElementIndex; i++) {
            System.out.print(array[i] + " ");
        }
    }


}
