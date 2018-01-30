public interface LinkedListADT<E> {
	void addFirst(E o);
	void addLast(E o);
	void removeFirst();
	void removeLast();
	E getFirst();
	E getLast();
	int size();
}
