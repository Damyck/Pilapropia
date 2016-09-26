/**
 * Created by Marc on 19/9/2016.
 */

public class Main {
    public static void main(String[] arcs) {


        Pila<Integer> st1 = new PilaImpl<Integer>(10);
        try {
            st1.push(1);
            st1.push(2);
            st1.push(3);
            st1.push(4);
            st1.push(5);
            st1.push(6);
            st1.push(7);
            st1.push(8);
            st1.push(9);
            st1.push(10);
            st1.push(11);
        } catch (PilaPlena e) {
            System.out.println(e.getMessage());

            //
        }

        st1.size();
        try {
            System.out.print(st1.pop());
            st1.pop();
            st1.pop();
            st1.pop();
            st1.pop();
            st1.pop();
            st1.pop();
            st1.pop();
            st1.pop();
            st1.pop();
            st1.pop();
        }
        catch (PilaBuida e) {
            System.out.println(e.getMessage());
        }
    }
}
