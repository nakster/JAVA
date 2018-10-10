package ie.gmit.sw;

public class TestRunner {

	public static void main(String[] args) throws Throwable {
		
		CypheratorFactory cypher = CypheratorFactory.getInstance();
		
		Cypherator cypher1 = new RSACypher();
		String s = "Happy Days!";

		String t = new String(cypher1.encrypt(s.getBytes()));
		System.out.println("Encrypted: \n" + t);
		
		
		String d = new String(cypher1.decrypt(t.getBytes()));
		System.out.println("nDecrypted: \n" + d);

		//System.out.println("\n\nDecrypted:\n" + new String(cypher.decrypt(t.getBytes())));

	}
}