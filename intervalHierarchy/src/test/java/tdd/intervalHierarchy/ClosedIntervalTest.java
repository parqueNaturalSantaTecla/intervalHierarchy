package tdd.intervalHierarchy;

import org.junit.Test;

import junit.framework.TestCase;

public class ClosedIntervalTest extends TestCase {

	@Test
	public void testIntersectedOverlappedOnLeft() {
		ClosedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(1).max(7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIntersectedInside() {
		ClosedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(5).max(7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIntersectedOverlappedOnRight() {
		ClosedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(5).max(19).build();
		assertTrue(one.isIntersected(another));
	}
}
