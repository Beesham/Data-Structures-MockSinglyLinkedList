package queue;

import list.SinglyLinkedList;

public class Queue<E> {

	private SinglyLinkedList list;

	public Queue() {
		list = new SinglyLinkedList();
	}

	public void enqueue(E o) {
		list.addLast(o);
	}

	public Object dequeue() throws Exception {
		return list.removeFirst();
	}

	public Object front() {
		return list.getFirst();
	}

	/**
	 * Gets the size of the queue
	 * @return the size of the queue
	 */
	public int size() {
		return list.size();
	}

	/**
	 * Checks if the queue is empty
	 * @return true if the list is empty, else false
	 */
	public boolean isEmpty() {
		return list.size() == 0;
	}
}

