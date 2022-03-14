import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testSumOk(){

        Main main = new Main();
        main.sum(2, 5);
        //throw new RuntimeException("Chyba");
        assertEquals(7, main.sum(2, 5));

    }

    @Test
    public void testSumFail(){

        Main main = new Main();
        main.sum(2, 5);
        assertEquals(8, main.sum(2, 6));
    }

    @Test
    public void testSumError(){
        Main main = new Main();
        assertEquals(8, main.sum(2, 6));
    }

}
