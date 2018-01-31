import list.SinglyLinkedList;
import stack.Stack;

import java.util.EmptyStackException;

public class Tester {
	public static void main(String[] args) {
		SinglyLinkedList<String> list = new SinglyLinkedList<>();

		list.addFirst("B");
		list.addLast("e");
		list.addLast("e");
		list.addLast("s");
		list.addLast("h");
		list.addLast("a");
		list.addLast("m");

		try {
			System.out.print(list.removeFirst());
			System.out.print(list.removeFirst());
			System.out.print(list.removeFirst());
			System.out.print(list.removeFirst());
			System.out.print(list.removeFirst());
			System.out.print(list.removeFirst());
			System.out.print(list.removeFirst());
		} catch (Exception e) {
			e.printStackTrace();
		}

		list.addFirst("B");
		list.addLast("e");
		list.addLast("e");
		list.addLast("s");
		list.addLast("h");
		list.addLast("a");
		list.addLast("m");

		System.out.println(list.getFirst() + " = B");
		System.out.println(list.getLast() + " = m");
		try {
			System.out.println(list.removeFirst() + " = B");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Empty list");
		}
		System.out.println(list.getFirst() + " = e");
		try {
			System.out.println(list.removeLast() + " = m");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(list.getLast() + " = a");
		System.out.println(list.size());

		balanceBracketsCheck();
	}

	private static void balanceBracketsCheck() {
		checkForBalanceInTheBrackets("(9*[3*{[(3+3)/5]*7}])"); //balanced
		checkForBalanceInTheBrackets("{3*(2+[3-[4/[6/9]]]})"); //un-balanced
		checkForBalanceInTheBrackets("((3*(9-(4*(6-5))))"); //un-balanced
		checkForBalanceInTheBrackets("{2-{3*{6/[[[(((9-0)))]]]}}/7}"); //balanced
		checkForBalanceInTheBrackets("{2-{3*{6/[[[(((9-0))xngf)]]]}}/7}"); //unknown chars
		checkForBalanceInTheBrackets("((())"); //empty string
	}

	/**
	 * Checks an string equation if it has balanced parenthesis
	 * @param s the string to check for balanced parenthesis
	 */
	private static void checkForBalanceInTheBrackets(String s) {
		Stack<Character> stack = new Stack();
		int lengthOfString = s.length();

		boolean balancedFlag;

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

		//checks for any unknown characters in the string
		if(checkForUnknownChars(s, CONST_SYMBOLS)) {
			System.out.println("FOUND_UNKNOWN_CHAR");
		}else if(s.length() == 0) {
			System.out.println("EMPTY_STRING");
		}else{
			//O(n) checks for balanced parenthesis
			for (int i = 0; i < lengthOfString; i++) {

				if (s.charAt(i) == OPEN_CURLEY_BRACE ||
						s.charAt(i) == OPEN_SQUARE_BRACE ||
						s.charAt(i) == OPEN_CURVE_BRACE) {
					try {
						stack.push(s.charAt(i));
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (s.charAt(i) == CLOSE_CURLEY_BRACE ||
						s.charAt(i) == CLOSE_SQUARE_BRACE ||
						s.charAt(i) == CLOSE_CURVE_BRACE) {

					try {
						//checks the stack for open bracket for a found closing bracket
						switch (s.charAt(i)) {
							case CLOSE_CURLEY_BRACE:
								if (stack.top() == OPEN_CURLEY_BRACE) {
									stack.pop();
								} else balancedFlag = false;
								break;
							case CLOSE_SQUARE_BRACE:
								if (stack.top() == OPEN_SQUARE_BRACE) {
									stack.pop();
								} else balancedFlag = false;
								break;
							case CLOSE_CURVE_BRACE:
								if (stack.top() == OPEN_CURVE_BRACE) {
									stack.pop();
								} else balancedFlag = false;
								break;
						}
					} catch (EmptyStackException e) {
						balancedFlag = false;
					}
				}
			}


			if (!stack.isEmpty()) balancedFlag = false;
			else balancedFlag = true;

			if (balancedFlag) System.out.println("Balanced");
			else System.out.println("Unbalanced");
		}
	}

	/**
	 * Checks for unknown characters in a string against a given data set
	 * @param s the string to check
	 * @param validList the list to check against
	 * @return true if a mis-match is found
	 */
	private static boolean checkForUnknownChars(String s, char[] validList) {

		final boolean FOUND_UNKNOWN_CHAR = true;
		boolean foundFlag;

		//O(n^2)
		for(int i = 0; i < s.length(); i++) {
			foundFlag = false;
			for(int j = 0; j < validList.length; j++) {
				if(s.charAt(i) == validList[j]) {
					j = validList.length;
					foundFlag = true;
				}
				if(j == validList.length - 1 && foundFlag == false) return FOUND_UNKNOWN_CHAR;
			}
		}

		return false;
	}
}
