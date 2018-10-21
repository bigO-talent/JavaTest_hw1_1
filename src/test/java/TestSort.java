import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSort {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testshell() {
		System.out.println("shellsort");
		Sort sort = new Sort();
		assertArrayEquals(new int[] {1,2,3}, sort.shellsort(new int[] {3,1,2}));
		assertArrayEquals(new int[] {1,2,3,4}, sort.shellsort(new int[] {3,1,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5}, sort.shellsort(new int[] {5,3,1,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5,6}, sort.shellsort(new int[] {6,3,1,5,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7}, sort.shellsort(new int[] {3,7,1,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8}, sort.shellsort(new int[] {3,7,1,8,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, sort.shellsort(new int[] {3,7,9,1,8,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, sort.shellsort(new int[] {3,7,9,1,8,6,4,2,10,5}));
	}
	@Test
	public void testquick() {
		System.out.println("merge");
		Sort sort = new Sort();
		
		assertArrayEquals(new int[] {1,2,3}, sort.merge(new int[] {3,1,2}));
		assertArrayEquals(new int[] {1,2,3,4}, sort.merge(new int[] {3,1,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5}, sort.merge(new int[] {5,3,1,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5,6}, sort.merge(new int[] {6,3,1,5,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7}, sort.merge(new int[] {3,7,1,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8}, sort.merge(new int[] {3,7,1,8,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, sort.merge(new int[] {3,7,9,1,8,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, sort.merge(new int[] {3,7,9,1,8,6,4,2,10,5}));
	
	}
}
