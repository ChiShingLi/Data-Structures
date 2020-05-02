public class Main {

    public static void main(String[] args) {
        Queue myArrayQueue = new Queue(4);

        myArrayQueue.enQueue("1");
        myArrayQueue.enQueue("2");
        myArrayQueue.enQueue("3");
        myArrayQueue.enQueue("4");
        myArrayQueue.enQueue("5"); //this won't be added to the queue since max size is 4
        //myArrayQueue.deQueue();
        //myArrayQueue.deQueue();
        // myArrayQueue.deQueue();
        //myArrayQueue.deQueue();
        myArrayQueue.printQueue();

        //System.out.println(myArrayQueue);

    }


}
