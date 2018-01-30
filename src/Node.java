public class Node<E> {

	private Object o;
	private Node next;

	public Node(Object o, Node next) {
		this.o = o;
		this.next = next;
	}

	public Node() {
	}

	public Object getO() {
		return o;
	}

	public void setO(Object o) {
		this.o = o;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
