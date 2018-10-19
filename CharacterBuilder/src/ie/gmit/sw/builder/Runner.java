package ie.gmit.sw.builder;

public class Runner {
	public static void main(String[] args) throws Exception {
		
		CharacterDirector cd = new CharacterDirector((s,t)-> s.length() *t.length());
		
		for (int i = 0; i < 100; i++) {
			cd.append((char)i);
		}
		
		CharSequence seq = cd.getCharSequence();
		System.out.println(seq);
	}

}
