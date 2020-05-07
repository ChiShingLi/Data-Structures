public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack();

        //TEST CASE
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack); // 4 -> 3 -> NULL

        myStack.pop();
        System.out.println(myStack); //3 -> NULL

        System.out.println(myStack.top()); //3
    }
}
