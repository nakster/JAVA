package ie.gmit.sw;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class DESCypher {

	public DESCypher() throws Throwable {
		
		KeyGenerator keyGen = KeyGenerator.getInstance("DES");
		keyGen.init(56);
		super.setKey(keyGen.generateKey());
		super.setCypher(Cipher.getInstance("DES/ECB/PKCS5Padding"));

	}
}
