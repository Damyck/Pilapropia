import static org.junit.Assert.*;

/**
 * Created by Marc on 26/9/2016.
 */
public class PilaImplTest {
    Pila<Integer> st1 ;
    @org.junit.Before
    public void setUp() throws Exception {
        st1 = new PilaImpl<Integer>(10);
        st1.push(1);
        st1.push(2);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        this.st1 = null;
    }

    @org.junit.Test
    public void push() throws Exception {
        st1.push(1837);
        assertNotEquals(4, st1.size());
    }



}