package ie.gmit.sw;

import java.util.concurrent.CyclicBarrier;

public class CypheratorFactory {
	
	private static CypheratorFactory cf = new CypheratorFactory();
	
	private CypheratorFactory() {
		
	}

	public static CypheratorFactory getInstance() {
		return cf;
	}
	
	public Cypherator newCypherator() throws Throwable() {
		
	}
}
