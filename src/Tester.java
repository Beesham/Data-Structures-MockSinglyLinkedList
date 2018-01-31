public class Tester {
	public static void main(String[] args) {
		SinglyLinkedList<String> list = new SinglyLinkedList<>();

		list.addFirst("B");
		list.addLast("e");
		list.addLast("e");

		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.size());
	}
}
