import junit.framework.TestCase;
import org.junit.Test;

/**
 */
public class TestFooBarQixV2 {

    /**
     * Feature 1: Les nombres non concernes sont inchanges
     */
    @Test
    public void testIdentique() {
        checkIdentity(1, 2, 4, 8, 11);
    }

    private void checkIdentity(int... params) {
        for(int i : params) {
            TestCase.assertEquals(""+i, FooBarQixV2.get(i));
        }
    }

    /**
     * Feature 2: Les nombres contenant 3
     */
    @Test
    public void testContient3() {
        TestCase.assertEquals("Foo", FooBarQixV2.get(13));
        TestCase.assertFalse("Foo".equals(FooBarQixV2.get(4)));
    }

    /**
     * Feature 3: Les nombres divisibles par 3
     */
    @Test
    public void testDivisiblePar3() {
        TestCase.assertEquals("Foo", FooBarQixV2.get(6));
        TestCase.assertEquals("Foo", FooBarQixV2.get(9));
        TestCase.assertEquals("Foo", FooBarQixV2.get(12));
    }

    @Test
    public void testContient3etEstDivisiblePar3() {
        TestCase.assertEquals("FooFoo", FooBarQixV2.get(3));
        TestCase.assertEquals("FooFooFoo",  FooBarQixV2.get(33));
    }

    @Test
    public void testSamples() {
        TestCase.assertEquals("FooBarBar",  FooBarQixV2.get(15));
        TestCase.assertEquals("FooBarFoo",  FooBarQixV2.get(30));
        TestCase.assertEquals("FooQix",  FooBarQixV2.get(21));
    }

    @Test
    public void testAll() {
        for (int i = 1; i<=100; i++) {
            String s = FooBarQixV2.get(i);
            checkDivisble(s, i, 3, 5, 7);
            checkContient(s, i, 3, 5, 7);
        }
    }

    @Test
    public void testFromFilled() {
        for (int i = 1; i<=100; i++) {
            TestCase.assertEquals(FooBarQixV2.getFromFilled(i), FooBarQixV2.get(i));
        }
    }

    private void checkContient(String s, int value, int... by) {
        for (int i : by) {
            String s1 = "" + value;
            if (s1.contains(""+i))
              TestCase.assertTrue(s.contains(FooBarQixV2.code(i)));
        }
    }

    private void checkDivisble(String s, int value, int... by) {
        for (int i : by) {
            if (value % i == 0)
                TestCase.assertTrue("Error with " + value + " : " + s, s.contains(FooBarQixV2.code(i)));
        }
    }

}
