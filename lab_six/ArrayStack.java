/**
 * Created by Asseel tarish on 11/03/20.
 */
public class ArrayStack<E> implements stack<E>  {
    static final int CAPACITY=100;
    E data[];
//    int size=0;
    int t=-1;
/////if size of the array was selecteed by the user
    public ArrayStack(int c) {
        data= (E[]) new Object[c];
    }
/////if user did not identify the size of the array
    public ArrayStack() {
        this(CAPACITY);
    }


    @Override
    public boolean isEmpy() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public E top() {
    if (isEmpy()) return null;
        return data[t];
    }

    @Override
    public E pop() {
        if (isEmpy())return null;
        E deleted=data[t];  // storing element before it is deleted
        data[t]=null;
        t--;
        return deleted;
    }

    @Override
    public void push(E element) {
        if(size()==data.length)throw new  IllegalStateException("Stack is full");
        // or t++ then data[t]=element
        data[++t]=element;
//       try {
//
//       }
//       catch (){
//
//       }
       }
}
