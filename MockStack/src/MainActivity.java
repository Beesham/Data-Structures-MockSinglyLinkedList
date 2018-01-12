public class MainActivity {
    public static void main(String[] args) {

        Stack<String> myStack = new Stack();


        try {
            myStack.push("a");
            myStack.push("b");
            myStack.push("c");
            myStack.push("d");
            myStack.push("e");
            myStack.push("f");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
