import javax.crypto.Cipher;
import java.security.*;

public class Abstractcypher {

	private Key key;
	private Cipher cypher;

	public Abstractcypher() {
		super();
	}
	
	public Key getKey() {
		return key;
	}


	public void setKey(Key key) {
		this.key = key;
	}

	public Cipher getCypher() {
		return cypher;
	}


	public void setCypher(Cipher cypher) {
		this.cypher = cypher;
	}


	public byte[] encrypt(byte[] plainText) throws Throwable {
		
		cypher.init(Cipher.ENCRYPT_MODE,key);
		return cypher.doFinal(plainText);
	
	}

	public byte[] decrypt(byte[] cypherText) throws Throwable {
		cypher.init(Cipher.PRIVATE_KEY,key);
		return cypher.doFinal(cypherText);
	
	}

}