public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack(5);

        System.out.println(myStack.isEmpty()); //true

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack); // 1, 2 , 3 -> but think of it as 3, 2, 1
    }
}

