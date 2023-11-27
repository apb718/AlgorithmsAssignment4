import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Stutter {

	public <E> List<E> stutterHead(List<E> L) {
		
		if(L.isEmpty()) {
			return new LinkedList<>();
		}
		List<E> outlist = new LinkedList<>();
		outlist.add(L.get(0));
		outlist.add(L.get(0));
		outlist.addAll(stutterHead(L.subList(1, L.size())));
		return outlist;
	}
	
	
	public <E> List<E> stutterTail(List<E> L) {
		return stutterTail(L.iterator(), new LinkedList<>());
	}
	private <E> List<E> stutterTail(Iterator<E> it, List<E> accum) {
		if(!it.hasNext()) {
			return accum;
		}
		E val = it.next();
		accum.add(val);
		accum.add(val);
		
		return stutterTail(it, accum);
		
	}
	public static void main(String[] args) {
		Stutter s = new Stutter();
		System.out.println("This is stutter");
		System.out.println(s.stutterHead(Arrays.asList(4,65,6,3)));
		
	}
}
