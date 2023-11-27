import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FindMin {

	public int getMin(int[] array) {
		return getMin(array, 0, array.length-1);
	}
	private int getMin(int[] array, int front, int back) {
		if(front == back) {return array[front];}
		if(array[front] >= array[back]) {
			return getMin(array, front+1, back);
		} else {
			return getMin(array, front, back-1);
		}
		
	}
	
	public <E extends Comparable<? super E>> E minimum(List<E> t) {
		E min;
        if (t.size() == 1) {
        	return t.get(0);
        } else {
            E first = t.get(0);
            List<E> u = t.subList(1, t.size());
//            minInt = Math.min(first, u.get(0));
            min = first.compareTo(minimum(u)) < 0 ? first : minimum(u); 
        }
        return min;
	}
	
	public <E extends Comparable<? super E>> E getMin(List<E> L) {
		return getMin(L, L.iterator(), L.get(0));
	}
	private <E extends Comparable<? super E>> E getMin(List<E> L, Iterator it, E min) {
		if(!it.hasNext()) {
			return min;
		}
		E current = (E) it.next();
		if(min.compareTo(current) > 0) {
			min = current;
		}
		return getMin(L, it, min);
	}
    
  }
	

/*
 * Question 2
 * Konstantin F.'s solution is not very good, because the base case 
 * will always set the returned value to -1 so unless the actual min
 * is less than -1, it will always return -1
*/