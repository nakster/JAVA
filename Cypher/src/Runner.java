
public class Runner {
	public static void main(String[] args) throws Throwable {
		
		Abstractcypher c= new RSACypher();
		
		String s = "Happy Days!";
		
		byte[] cypherText = c.encrypt(s.getBytes());
		System.out.println(new String(cypherText));
		
		System.out.println(new String(c.decrypt(cypherText)));
	}

}