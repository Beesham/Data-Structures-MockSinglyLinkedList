public class Tester {
	public static void main(String[] args) {
		SinglyLinkedList<String> list = new SinglyLinkedList<>();

		list.addFirst("B");
		list.addLast("e");
		list.addLast("e");

		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		try {
			System.out.println(list.removeFirst());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Empty list");
		}
		System.out.println(list.getFirst());
		System.out.println(list.size());
	}
}
