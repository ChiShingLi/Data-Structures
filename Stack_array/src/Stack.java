// Stack (Array implementation)

public class Stack {
    int size;
    int top;
    int[] arrayStack;

    public Stack() {
        arrayStack = new int[size]; //declare arrayStack at init
        top = -1; //null
    }

    //add data to the stack
    public void push(int data) {
        //if the top pointer is at max capacity, do nothing is the stack is full
        if (top == arrayStack.length - 1) {
            return;
        }
        //else, increase top pointer and add data to the stack
        top++;
        arrayStack[top] = data;
    }

    //remove data from the stack
    public void pop() {
        //if the stack is not empty already
        if (top != -1) {
            top++;
        }
    }

    //check if the stack is empty or not
    public boolean isEmpty() {
        return (top == -1);
    }

    //get the top of the stack
    public int top() {
        //return -1 if stack is empty
        if (isEmpty()) {
            return -1;
        }
        return arrayStack[top];
    }


}
