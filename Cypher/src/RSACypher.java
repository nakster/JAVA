import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;

public class RSACypher extends Abstractcypher {

	private KeyPair keyRing;

	public RSACypher() throws Throwable {
		super();
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(2048);
		keyRing = keyGen.generateKeyPair();
		super.setCypher(Cipher.getInstance("RSA/ECB/PKCS1Padding"));
	}

	@Override
	public byte[] encrypt(byte[] plainText) throws Throwable {
		super.setKey(keyRing.getPublic());
		return super.encrypt(plainText);
	}

	@Override
	public byte[] decrypt(byte[] cypherText) throws Throwable {
		super.setKey(keyRing.getPublic());
		return super.decrypt(cypherText);
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.getClass().getName() + "about to be GC'D");
	}

}