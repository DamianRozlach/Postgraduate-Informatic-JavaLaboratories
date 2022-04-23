package pl.edu.agh.asd1;

import org.junit.Test;
import pl.edu.agh.asd1.ex08.Heap;

import static org.junit.Assert.assertEquals;

public class Exercise08HeapTest {

	@Test
	public void testOrderedInserting() {
		Heap heap = new Heap();
		heap.offer(7);
		heap.offer(3);
		heap.offer(2);
		heap.offer(1);

		assertEquals(4, heap.size());

		assertEquals(7, heap.poll());
		assertEquals(3, heap.poll());
		assertEquals(2, heap.poll());
		assertEquals(1, heap.poll());

		assertEquals(0, heap.size());
	}

	@Test
	public void testUnorderedInserting() {
		Heap heap = new Heap();
		heap.offer(3);
		heap.offer(1);
		heap.offer(7);
		heap.offer(2);

		assertEquals(4, heap.size());

		assertEquals(7, heap.poll());
		assertEquals(3, heap.poll());
		assertEquals(2, heap.poll());
		assertEquals(1, heap.poll());

		assertEquals(0, heap.size());
	}

	@Test
	public void testEmptySizeIsZero(){
		Heap heap = new Heap();

		assertEquals(0, heap.size());
	}

}
