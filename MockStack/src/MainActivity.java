public class MainActivity {
    public static void main(String[] args) {
		checkForBalanceInTheBranckets("(9*[3*{[(3+3)/5]*7}])");
    }

    private static void checkForBalanceInTheBranckets(String s) {
        Stack<String> stack = new Stack();
        int lengthOfString = s.length();

		final char OPEN_CURLEY_BRACE = '{';
		final char OPEN_SQUARE_BRACE = '[';
		final char OPEN_CURVE_BRACE = '(';
		final char CLOSE_CURLEY_BRACE = '}';
		final char CLOSE_SQUARE_BRACE = ']';
		final char CLOSE_CURVE_BRACE = ')';

		final char[] CONST_SYMBOLS = {
				OPEN_CURLEY_BRACE,
				OPEN_SQUARE_BRACE,
				OPEN_CURVE_BRACE,
				CLOSE_CURLEY_BRACE,
				CLOSE_SQUARE_BRACE,
				CLOSE_CURVE_BRACE,
				'0','1','2','3','4','5','6','7','8','9','+','-','*','/'
		};


		for(int i = 0; i < lengthOfString; i++) {
			try {
				if(s.charAt(i) == OPEN_CURLEY_BRACE ||
						s.charAt(i) == OPEN_SQUARE_BRACE ||
						s.charAt(i) == OPEN_CURVE_BRACE ||
						s.charAt(i) == CLOSE_CURLEY_BRACE ||
						s.charAt(i) == CLOSE_SQUARE_BRACE ||
						s.charAt(i) == CLOSE_CURVE_BRACE) {
					stack.push(s.charAt(i));
				}else{
					System.out.println("UNKNOWN ");
					return;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		for(int i = 0; i < lengthOfString; i++) {
			try {
				stack.push(s.charAt(i));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

    }

    private void checkForUnknownChars(String s, String[] validList) {

	}

    private void testStack() {

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
