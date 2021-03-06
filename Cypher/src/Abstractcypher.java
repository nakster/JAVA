import javax.crypto.Cipher;
import java.security.*;

public abstract class Abstractcypher implements Cypherator {

	private Key key;
	private Cipher cypher;

	public Abstractcypher() {
		super();
	}
	
	/* (non-Javadoc)
	 * @see Cypherator#getKey()
	 */
	@Override
	public Key getKey() {
		return key;
	}


	/* (non-Javadoc)
	 * @see Cypherator#setKey(java.security.Key)
	 */
	@Override
	public void setKey(Key key) {
		this.key = key;
	}

	public Cipher getCypher() {
		return cypher;
	}


	public void setCypher(Cipher cypher) {
		this.cypher = cypher;
	}


	/* (non-Javadoc)
	 * @see Cypherator#encrypt(byte[])
	 */
	@Override
	public byte[] encrypt(byte[] plainText) throws Throwable {
		
		cypher.init(Cipher.ENCRYPT_MODE,key);
		return cypher.doFinal(plainText);
	
	}

	/* (non-Javadoc)
	 * @see Cypherator#decrypt(byte[])
	 */
	@Override
	public byte[] decrypt(byte[] cypherText) throws Throwable {
		cypher.init(Cipher.PRIVATE_KEY,key);
		return cypher.doFinal(cypherText);
	
	}

}