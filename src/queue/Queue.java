package queue;

import list.SinglyLinkedList;

public class Queue<E> {

	private SinglyLinkedList list;

	private int size;

	public void enqueue(Object o) {
		//TODO
	}

	public Object dequeue() {
		//TODO
		return null;
	}

	public Object front() {
		//TODO
		return null;
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

