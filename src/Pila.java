/**
 * Created by Marc on 19/9/2016.
 */
public interface Pila <E> {


    public void push(E e) throws PilaPlena;
    public E pop() throws PilaBuida;
    public int size();


}
