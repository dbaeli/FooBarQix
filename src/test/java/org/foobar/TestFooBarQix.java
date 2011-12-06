import junit.framework.TestCase;
import org.junit.Test;

/**
 */
public class TestFooBarQix {

    @Test
    public void test1() {
        TestCase.assertEquals("1", FooBarQix.get(1));
    }

    @Test
    public void test2() {
        TestCase.assertEquals("2", FooBarQix.get(2));
    }

    @Test
    public void testContient3() {
        TestCase.assertEquals("Foo", FooBarQix.get(13));
        TestCase.assertFalse("Foo".equals(FooBarQix.get(4)));
    }

    @Test
    public void testDivisiblePar3() {
        TestCase.assertEquals("Foo", FooBarQix.get(6));
        TestCase.assertEquals("Foo", FooBarQix.get(9));
        TestCase.assertEquals("Foo", FooBarQix.get(12));
    }

    @Test
    public void testContient3etEstDivisiblePar3() {
        TestCase.assertEquals("FooFoo", FooBarQix.get(3));
        TestCase.assertEquals("FooFoo", FooBarQix.get(30));
    }


}
