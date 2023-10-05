package GarbageCollector;

public class Example {
	
	
	//JVM invoke Garbage collector by calling System.gc() -> finalize()
	//All objects having reference zero will be removed from memory by Garbaje collector.


	static int count;

	void m1() {
		Example obj = null;
		for (int i = 1; i < 100; i++) {
			obj = new Example();
			System.gc(); // it is only request
		}
	}

	@Override
	public void finalize() {
		System.out.println("GC has been called "+count++);

	}

	public static void main(String[] args) {
		new Example().m1();

	}

}
