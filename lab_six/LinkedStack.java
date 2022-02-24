/**
 * Created by Asseel tarish on 11/03/20.
 */
public class LinkedStack<E> implements stack<E>{
    SingleLinkedList <E> list=new SingleLinkedList<E>();


    @Override
    public boolean isEmpy() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public E pop() {
        return list.removFirst();
    }

    @Override
    public void push(E element) {
      list.addFirst(element);
    }

}
