import list.SinglyLinkedList;

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
	}
}
