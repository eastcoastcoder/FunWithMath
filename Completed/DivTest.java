import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

/**
 * Secrets of Mental Math
 * p. 98
 */

public class DivTest {

    private Div d;

    @Before
    public void setUp() throws Exception {
        d = new Div();

    }

    @Test
    public void testTwo() throws Exception {
        assertTrue(d.two(53428));
        assertFalse(d.two(293));
        assertFalse(d.two(7421));
        assertTrue(d.two(53428));
    }

    @Test
    public void testFour() throws Exception {
        assertTrue(d.four(3932));
        assertTrue(d.four(67348));
        assertFalse(d.four(358));
        assertFalse(d.four(57929));
    }

    @Test
    public void testEight() throws Exception {
        assertFalse(d.eight(59366));
        assertTrue(d.eight(73488));
        assertTrue(d.eight(248));
        assertFalse(d.eight(6111));
    }

    @Test
    public void testThree() throws Exception {
        assertFalse(d.three(83671));
        assertTrue(d.three(94737));
        assertTrue(d.three(7359));
        assertTrue(d.three(3267486));
    }

    @Test
    public void testSix() throws Exception {
        assertTrue(d.six(5334));
        assertTrue(d.six(67386));
        assertFalse(d.six(248));
        assertFalse(d.six(5991));
    }

    @Test
    public void testNine() throws Exception {
        assertFalse(d.nine(1234));
        assertTrue(d.nine(8469));
        assertFalse(d.nine(4425575));
        assertTrue(d.nine(314159265));
    }

    @Test
    public void testFive() throws Exception {
        assertTrue(d.five(47830));
        assertFalse(d.five(43762));
        assertTrue(d.five(56785));
        assertTrue(d.five(37210));
    }

    @Test
    public void testEleven() throws Exception {
        assertTrue(d.eleven(53867));
        assertFalse(d.eleven(4969));
        assertTrue(d.eleven(3828));
        assertTrue(d.eleven(941369));
    }

    //Stubs
    @Test
    public void testSeven() throws Exception {
        d.seven(53867);
    }

    @Test
    public void testOddNotFive() throws Exception {

    }
}
