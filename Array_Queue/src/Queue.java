import java.util.Arrays; //FOR TEST PURPOSE print

/*
    regular queue using linkedList
    -
    Operations:
    isEmpty() = O(1)
    front() = O(1)
    rear() = O(1)
    isFull() = O(1)
    enQueue() = O(1)
    deQueue() = O(1)

 */
public class Queue {
    String[] arrayQueue;
    int size;
    int front;
    int rear;

    public Queue(int size) {
        this.size = size;
        arrayQueue = new String[size];
        int front = -1;
        int rear = -1;
    }

    public boolean isEmpty() {
        //if head/front is empty, return true
        if (arrayQueue[front] == null) {
            return true;
        }
        return false;
    }

    //return the item in front
    public String front() {
        return arrayQueue[front];
    }

    //return the item at the end
    public String rear() {
        return arrayQueue[rear];
    }

    public boolean isFull() {
        if (rear >= (size - 1)) {
            return true;
        }
        return false;
    }

    public void enQueue(String data) {
        //if the item is the first item in the queue
        if (arrayQueue[front] == null) {
            //since it's the first item, set front and rear pointing to index 0
            front = rear = 0;
            arrayQueue[rear] = data;
        } else if (!(isFull())) {
            //if not full, add to the rear of the queue
            rear++;
            arrayQueue[rear] = data;
        }
    }

    //deQueue from the front
    public void deQueue() {
        //if the queue is empty or the next element is empty, set front & rear to -1
        if (isEmpty()) {
            front = -1;
            rear = -1;
            return;
        }
        //else just move front by one
        front++;
    }

    //FOR TESTING PURPOSE: print out the queue progression
    public void printQueue() {

        for (int i = front; i < size; i++) {
            System.out.print(arrayQueue[i] + " -> ");
        }
        System.out.print("NULL");
        System.out.println("");
    }


    //FOR TESTING PURPOSE: print out the full queue
    public String toString() {

        return Arrays.toString(arrayQueue);
    }


}
