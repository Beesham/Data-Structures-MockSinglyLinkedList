package stack;

import list.SinglyLinkedList;
import java.util.EmptyStackException;

/**
 * Stack implementation on an array
 * @param <E>
 * @author Beesham
 */
public class Stack<E> implements StackADT{

    private SinglyLinkedList<E> list;
    private int stackCount; //Keeps a count of the elements in the stack

    public Stack() {
        list = new SinglyLinkedList<>();
        stackCount = 0;
    }

    /**
     * Inserts an element
     * @param object object to be added to top of stack
     */
    public void push(Object object) throws Exception {
        list.addFirst(object);
        stackCount++;
    }

    /**
     * Removes and returns the last inserted element
     * @return the last inserted element
     */
    public E pop() throws EmptyStackException{
        if(stackCount == 0) {
            throw new EmptyStackException();
        }else{
            try {
                stackCount--;
                return (E) list.removeFirst();
            } catch (Exception e) {
                e.printStackTrace();
                throw new EmptyStackException();
            }
        }
    }

    /**
     * Returns the last inserted element without removing it
     * @return object
     */
    public E top() throws EmptyStackException{
        if(stackCount == 0) {
            throw new EmptyStackException();
        }else{
            return (E) list.getFirst();
        }
    }

    /**
     * Returns the number of elements stored
     * @return size of stack
     */
    public int size() {
        return stackCount;
    }

    /**
     * Indicated whether no elements are stored
     * @return true: empty otherwise false
     */
    public boolean isEmpty() {
        return size() == 0 ? true : false;
    }
}
