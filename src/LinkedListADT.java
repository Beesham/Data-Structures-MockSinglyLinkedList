public interface LinkedListADT<E> {
	void addFirst(E o);
	void addLast(E o);
	E removeFirst() throws Exception;
	E removeLast() throws Exception;
	E getFirst();
	E getLast();
	int size();
}
