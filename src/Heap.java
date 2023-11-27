import java.lang.reflect.Array;
import java.util.Arrays;

public class Heap<E extends Comparable<? super E>> {
	private E[] array;
	private int lastUsedSpot;
	
	//A heap needs to create an array of 'some size'.
	//Java chose 11, and we're using the same here.
	
	public Heap(Class<E[]> c) { this(c,11); } 
	
	public Heap(Class<E[]> c, int initialCapacity) {
		array = c.cast(Array.newInstance(c.getComponentType(), initialCapacity));  
		lastUsedSpot = 0; //arithmetic is simpler if we start at 1 and consider 0 'used up'
	}
	
	
	public E getMinimumRecursive() {
		return getMinimumRecursive(array[lastUsedSpot], lastUsedSpot);
	}
	
	private E getMinimumRecursive(E minSoFar, int index) {
		// complete...
		if(lastUsedSpot/2 == index) {
			return minSoFar;
		}
		if(array[index].compareTo(minSoFar) < 0) {
			return getMinimumRecursive(array[index], --index);
		}
		return getMinimumRecursive(minSoFar, --index);
		
	}
	
	private void dump(E element) {
		array[++lastUsedSpot]=element;
	}
	
	//Fix a heap that we messed up by dumping data in spot k
	private void fix(int k) {
		while (k > 1 && array[k].compareTo(array[k / 2]) > 0) {
            // Swap the current element with its parent if it violates the heap property
            E temp = array[k];
            array[k] = array[k / 2];
            array[k / 2] = temp;

            // Move up to the parent index
            k = k / 2;
        }
	}

	public void insert(E element) {
		if(lastUsedSpot == array.length-1) //resize
			this.array = Arrays.copyOf(array, array.length * 2);
		dump(element);
		fix(lastUsedSpot);
	}
	
	public String toString() {
		String res = "";
		for(int i=1; i<=lastUsedSpot; i++)
			res += array[i].toString() + " ";
		return res;
	}
	
	public static void main(String[] args) {
		Heap<Integer> heapee = new
				Heap<Integer>(Integer[].class);
		Integer[] content = {5,9,7,14,2};
		//heapee.insert(content);
		System.out.println(heapee);
		
//		If you want to insert a few elements one by one:
		heapee.insert(5);
		heapee.insert(9);
		heapee.insert(7);
		heapee.insert(14);
		heapee.insert(2);
		heapee.insert(5);
		heapee.insert(9);
		heapee.insert(100);
		heapee.insert(42);
		heapee.insert(18);
		heapee.insert(4);
		
		System.out.println(heapee.getMinimumRecursive());
//		System.out.println(heapee);
	}

}
