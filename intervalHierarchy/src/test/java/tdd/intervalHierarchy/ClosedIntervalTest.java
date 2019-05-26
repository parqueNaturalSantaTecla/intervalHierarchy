package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;

public class IntervalTest extends TestCase {

	@Test
	public void testIntersected() {
		Interval one = new IntervalBuilder().min(3).max(14).build();
		Interval another = new IntervalBuilder().min(1).max(7).build();
		assertTrue(one.isIntersected(another));
	}
}
