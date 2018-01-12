public class MainActivity {
    public static void main(String[] args) {

        Stack<String> myStack = new Stack();

        try {
            myStack.push("a");
            myStack.push("b");
            myStack.push("c");
            myStack.push("d");
            myStack.push("e");
            //myStack.push("f"); //Uncomment to test overflow


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
