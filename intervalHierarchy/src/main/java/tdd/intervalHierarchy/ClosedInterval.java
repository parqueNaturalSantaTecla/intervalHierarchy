package tdd.intervalHierarchy;

public class ClosedInterval {

	private double min;
	private double max;

	public ClosedInterval(double min, double max) {
		this.min = min;
		this.max = max;
	}

	public boolean isIntersected(ClosedInterval another) {
		return !(another.max < this.min || this.max < another.min);
	}

	
}
