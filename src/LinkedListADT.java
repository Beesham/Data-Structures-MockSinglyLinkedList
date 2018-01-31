public interface LinkedListADT<E> {
	void addFirst(E o);
	void addLast(E o);
	E removeFirst() throws Exception;
	void removeLast() throws Exception;
	E getFirst();
	E getLast();
	int size();
}
