import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ItalianNumbersTest {
	@Test
    public void testFibWithZero() {
        ItalianNumbers italianNumbers = new ItalianNumbers();
        int result = italianNumbers.fib(0);
        assertEquals(0, result);
    }

    @Test
    public void testFibWithOne() {
        ItalianNumbers italianNumbers = new ItalianNumbers();
        int result = italianNumbers.fib(1);
        assertEquals(1, result);
    }

    @Test
    public void testFibWithSmallValue() {
        ItalianNumbers italianNumbers = new ItalianNumbers();
        int result = italianNumbers.fib(5);
        assertEquals(5, result);
    }

    @Test
    public void testFibWithMediumValue() {
        ItalianNumbers italianNumbers = new ItalianNumbers();
        int result = italianNumbers.fib(10);
        assertEquals(55, result);
    }

    @Test
    public void testFibWithLargeValue() {
        ItalianNumbers italianNumbers = new ItalianNumbers();
        int result = italianNumbers.fib(15);
        assertEquals(610, result);
    }
}
