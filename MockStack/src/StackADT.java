import java.util.EmptyStackException;

public interface StackADT<E> {
    void push(E o) throws Exception;
    E pop() throws EmptyStackException;
    E top() throws EmptyStackException;
    int size();
    boolean isEmpty();
}
