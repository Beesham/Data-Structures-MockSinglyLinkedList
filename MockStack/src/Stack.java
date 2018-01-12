import java.util.EmptyStackException;

/**
 *
 * @param <E>
 * @author Beesham
 */
public class Stack<E> implements StackADT{

    private E[] array;
    private int sizeOfStack;
    private final int INIT_SIZE_OF_ARRAY = 5;

    private int stackIndex;

    public Stack() {
        sizeOfStack = INIT_SIZE_OF_ARRAY;
        array = (E[]) new Object[sizeOfStack]; //Cast to E since java does not allow for new array with generics
        stackIndex = 0;
    }

    /**
     * Inserts an element
     * @param object object to be added to top of stack
     */
    public void push(Object object) throws Exception {
        if(stackIndex != size()) {
            array[stackIndex] = (E) object;
            stackIndex++;
        }else{
            throw new Exception("FullStackException");
        }
    }

    /**
     * Removes and returns the last inserted element
     * @return the last inserted element
     */
    public E pop() throws EmptyStackException{
        if(stackIndex == 0) {
            throw new EmptyStackException();
        }else{
            return array[--stackIndex];
        }
    }

    /**
     * Returns the last inserted element without removing it
     * @return object
     */
    public E top() throws EmptyStackException{
        //TODO
        return null;
    }

    /**
     * Returns the number of elements stored
     * @return size of stack
     */
    public int size() {
        return array.length;
    }

    /**
     * Indicated whether no elements are stored
     * @return true: empty otherwise false
     */
    public boolean isEmpty() {
        //TODO
        return false;
    }

}
