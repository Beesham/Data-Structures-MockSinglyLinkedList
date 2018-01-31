package list;

public class SinglyLinkedList<E> implements LinkedListADT {

	/*
	Size of the linked list
	 */
	private int size = 0;

	/*
	Head of list
	 */
	private Node head;

	/*
	Tail of list
	 */
	private Node tail;


	@Override
	public void addFirst(Object o) {
		Node n = new Node(o, head);
		head = n;
		if(size == 0) tail = n;
		size++;
	}

	@Override
	public void addLast(Object o) {
		Node n = new Node(o, null);
		tail.setNext(n);
		tail = n;
		if(size == 0) head = n;
		size++;
	}

	@Override
	public Object removeFirst() throws Exception {
		if(head == null) throw new Exception("Empty list");
		Node n = head;
		head = head.getNext();
		
		size--;
		return n.getO();
	}

	//O(n)
	@Override
	public Object removeLast() throws Exception {
		if(head == null) throw new Exception("Empty list");

		//Traverse the list to the second to last element
		Node tmp = head;
		for(int i = 0; i < size - 2; i++) {
			tmp = tmp.getNext();
		}

		tail = tmp;
		tail.setNext(null);

		size--;
		return tail.getO();
	}

	@Override
	public Object getFirst() {
		return head.getO();
	}

	@Override
	public Object getLast() {
		return tail.getO();
	}

	@Override
	public int size() {
		return size;
	}
}
