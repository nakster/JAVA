import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class TripleDES extends Abstractcypher{

	public TripleDES() throws Throwable{
		
		KeyGenerator keyGen = KeyGenerator.getInstance("DESede");
		keyGen.init(168);
		super.setKey(keyGen.generateKey());
		super.setCypher(Cipher.getInstance("DESede/ECB/PKCS5Padding"));
	}
}

