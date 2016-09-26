/**
 * Created by Marc on 19/9/2016.
 */
public class PilaImpl<E> implements Pila<E> {

    int size = 0;
    E[] elems;
    int len;

    public PilaImpl(int len){
        this.elems = (E[]) new Object[len];
        this.len = len;
    }


    @Override
    public void push(E e) throws PilaPlena{
        if (size >= len) throw  new PilaPlena();
        this.elems[size] = e;
        size ++;

    }

    @Override
    public E pop() throws  PilaBuida {
        if (size <= len) throw new PilaBuida();
        return this.elems[--size];
  //      size --;
    }

    @Override
    public int size() {
        return size;
    }
}
