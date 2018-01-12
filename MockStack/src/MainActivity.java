public class MainActivity {
    public static void main(String[] args) {

        Stack<String> myStack = new Stack();

        try {
            System.out.print(myStack.size());
            myStack.push("a");
            System.out.print(myStack.size());
            System.out.print(myStack.top());
            myStack.push("b");
            System.out.print(myStack.size());
            System.out.print(myStack.top());
            myStack.push("c");
            System.out.print(myStack.size());
            System.out.print(myStack.top());
            myStack.push("d");
            System.out.print(myStack.size());
            System.out.print(myStack.top());
            myStack.push("e");
            System.out.print(myStack.size());
            System.out.print(myStack.top());

            myStack.push("f");
            System.out.print(myStack.size());
            System.out.print(myStack.top());


            System.out.print(myStack.pop());
            System.out.print(myStack.pop());
            System.out.print(myStack.pop());
            System.out.print(myStack.pop());
            System.out.print(myStack.pop());
            System.out.print(myStack.pop());
            //System.out.print(myStack.pop()); //Uncomment to test underflow


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
