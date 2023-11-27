import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;



class TestMins {

	@Test
	void testGetMin1() {
		FindMin f = new FindMin();
		int[] array = {3,4,1,56,29, 0, 7};
		assertEquals(Arrays.stream(array).min().getAsInt(), f.getMin(array));
	}
	@Test
	void testGetMin2() {
		FindMin f = new FindMin();
		int[] array = {30,4,1,56,41,424,24,345465,629, 10, 7};
		assertEquals(Arrays.stream(array).min().getAsInt(), f.getMin(array));
	}
	@Test
	void testGetMin3() {
		FindMin f = new FindMin();
		int[] array = {1,61,53,5423,41,4,3478};
		assertEquals(Arrays.stream(array).min().getAsInt(), f.getMin(array));
	}
	
	@Test
	void testSOGetMin1() {
		FindMin f = new FindMin();
		int[] array = {1,7,3,8,6,2,4,1,2,6,8,9};
		List<Integer> list = new LinkedList<>();
		Arrays.stream(array).forEach((item) -> list.add(item));
		assertEquals(Arrays.stream(array).min().getAsInt(), f.minimum(list));
	}
	@Test
	void testSOGetMinString() {
		FindMin f = new FindMin();
		String[] array = {"Waffle", "Orange", "Foo", "Lettuce" };
		List<String> list = new LinkedList<>();
		Arrays.stream(array).forEach((item) -> list.add(item));
		assertEquals("Foo", f.minimum(list));
	}
	@Test
	void testSOGetMin2() {
		FindMin f = new FindMin();
		List<Integer> list = Arrays.asList(5, 2, 8, 1, 7);
		assertEquals(1, f.minimum(list));
	}
	
	@Test
	void testTailMin1() {
		FindMin f = new FindMin();
		List<String> list = Arrays.asList("Waffle", "Orange", "Foo", "Lettuce", "Abercrombie");
		assertEquals("Abercrombie", f.minimum(list));
	}
	@Test
	void testTailMin2() {
		FindMin f = new FindMin();
		List<Integer> list = Arrays.asList(5, 2, 8, 1, 7,-8,4,3);
		assertEquals(-8, f.minimum(list));
	}

}
