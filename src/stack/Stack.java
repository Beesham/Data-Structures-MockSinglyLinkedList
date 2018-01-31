package stack;

import list.SinglyLinkedList;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Stack implementation on an array
 * @param <E>
 * @author Beesham
 */
public class Stack<E> implements StackADT{

    private SinglyLinkedList<E> list;
    private int sizeOfStackArray;    //Size of the array (Stack)
    private final int INIT_SIZE_OF_ARRAY = 5;

    private int stackCount; //Keeps a count of the elements in the stack

    public Stack() {
        sizeOfStackArray = INIT_SIZE_OF_ARRAY;
        //array = (E[]) new Object[sizeOfStackArray]; //Cast to E since java does not allow for new array with generics
        list = new SinglyLinkedList<>();
        stackCount = 0;
    }

    /**
     * Inserts an element
     * @param object object to be added to top of stack
     */
    public void push(Object object) throws Exception {
        if(stackCount != sizeOfStackArray) {
            list.addFirst(object);
            stackCount++;
        }else{
            expandArray();
            push(object);
        }
    }

    /**
     * Removes and returns the last inserted element
     * @return the last inserted element
     */
    public E pop() throws EmptyStackException{
        if(stackCount == 0) {
            throw new EmptyStackException();
        }else{
            E o = array[--stackCount];
            array[stackCount] = null;
            return o;
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
            return array[stackCount - 1];
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

    /**
     * Expands the size of the array as Stack needs
     */
    private void expandArray() {
        sizeOfStackArray = sizeOfStackArray + INIT_SIZE_OF_ARRAY;
        E[] newArray = Arrays.copyOf(array, sizeOfStackArray);
        array = (E[]) new Object[sizeOfStackArray];
        array = Arrays.copyOf(newArray, sizeOfStackArray);
    }

}
