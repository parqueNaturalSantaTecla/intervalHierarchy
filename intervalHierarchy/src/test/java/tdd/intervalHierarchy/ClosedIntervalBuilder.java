package tdd.intervalHierarchy;

public class IntervalBuilder {

	private double min;
	
	private double max;
	
	IntervalBuilder(){
		this.min = 0;
		this.max = 1;
	}
	
	IntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	IntervalBuilder max(double max) {
		this.max = max;
		return this;
	}
	
	Interval build() {
		assert min <= max;
		return new Interval(min, max);
	}

	
}
