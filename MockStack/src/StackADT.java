import java.util.EmptyStackException;

public interface StackADT {
    void push(Object o);
    Object pop() throws EmptyStackException;
    Object top() throws EmptyStackException;
    int size();
    boolean isEmpty();
}
