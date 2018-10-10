
public class CypheratorFactory {

	private static CypheratorFactory cf = new CypheratorFactory();

	private CypheratorFactory() {

	}

	public static CypheratorFactory getInstance() {
		return cf;
	}

	public Cypherator newInstance(CypherAlgo algo) throws Throwable {

		// return (Cypherator) class.forName(ie.gmit.sw.WeirdCypherIMPL)

		if (algo == CypherAlgo.RSA) {
			return new RSACypher();
		} else if (algo == CypherAlgo.DES) {
			return new DESCypher();
		} else if (algo == CypherAlgo.AES) {
			return new AESCypher();
		} else {
			return new TripleDES();
		}
		
	}
}
