

public class MaxHeap {

    int size;
    int[] array;
    int currentElementIndex; //pointer pointing at where to insert the next item /also served as a pointer for the delete method

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

    //delete item from heap, could also made it in to a MAX heap sort
    public void delete() {

        //swap the first and last element
        swap(1, currentElementIndex - 1);
        currentElementIndex--; //mark the num as deleted by moving the pointer down

        //if only root, left & right children left
        if (currentElementIndex > 3) {
            //check their children
            //if left child is greater than right child
            if (array[2] > array[3]) {
                swap(1, 2); //swap left child with root
            } else if (array[2] < array[3]) {
                swap(1, 3); //swap right child with root
            }
        }
    }


    //print out the heap
    public void printHeap() {
        for (int i = 1; i < currentElementIndex; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
