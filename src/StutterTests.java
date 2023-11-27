
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class StutterTests {


    @Test
    public void testStutter_basicIntegerList() {
    	Stutter s = new Stutter();
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        List<Integer> expectedOutput = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4);
        assertEquals(expectedOutput, s.stutterHead(input));
    }

    @Test
    public void testStutter_singleElementList() {
    	Stutter s = new Stutter();
        List<Integer> input = Arrays.asList(5);
        List<Integer> expectedOutput = Arrays.asList(5, 5);
        assertEquals(expectedOutput, s.stutterHead(input));
    }

    @Test
    public void testStutter_emptyList() {
    	Stutter s = new Stutter();
        List<Integer> input = Arrays.asList();
        List<Integer> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, s.stutterHead(input));
    }

    @Test
    public void testStutter_stringListTail() {
        Stutter s = new Stutter();
    	List<String> input = Arrays.asList("a", "b", "c");
        List<String> expectedOutput = Arrays.asList("a", "a", "b", "b", "c", "c");
        assertEquals(expectedOutput, s.stutterTail(input));
    }
    @Test
    public void testStutter_basicIntegerListTail() {
    	Stutter s = new Stutter();
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        List<Integer> expectedOutput = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4);
        assertEquals(expectedOutput, s.stutterTail(input));
    }

    @Test
    public void testStutter_singleElementListTail() {
    	Stutter s = new Stutter();
        List<Integer> input = Arrays.asList(5);
        List<Integer> expectedOutput = Arrays.asList(5, 5);
        assertEquals(expectedOutput, s.stutterTail(input));
    }

    @Test
    public void testStutter_emptyListTail() {
    	Stutter s = new Stutter();
        List<Integer> input = Arrays.asList();
        List<Integer> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, s.stutterTail(input));
    }

    @Test
    public void testStutter_stringList() {
        Stutter s = new Stutter();
    	List<String> input = Arrays.asList("a", "b", "c");
        List<String> expectedOutput = Arrays.asList("a", "a", "b", "b", "c", "c");
        assertEquals(expectedOutput, s.stutterTail(input));
    }

    // Add more tests as needed

}


