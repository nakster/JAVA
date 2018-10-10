
public class CypheratorFactory {

	private static CypheratorFactory cf = new CypheratorFactory();
	
	private CypheratorFactory() {
		
	}
	
	public static CypheratorFactory getInstance() {
		return  cf;
	}
	
	public Cypherator newInstance() throws Throwable {
		
		return new DESCypher();
	}
}
