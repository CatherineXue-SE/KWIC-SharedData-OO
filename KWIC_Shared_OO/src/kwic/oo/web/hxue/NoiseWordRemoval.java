package kwic.oo.web.hxue;
import java.io.EOFException;
import java.util.Arrays;


public class NoiseWordRemoval  {

	public static final String noise[] = { "the", "and", "a", "to", "of", "in",
			"i", "is", "that", "it", "on", "you", "this", "for", "but", "with",
			"are", "have", "be", "at", "or", "as", "was", "so", "if", "out",
			"not", };
	public String line;
	
	public NoiseWordRemoval(String line)
	{
			this.line = line;		
	}

	public void remove(String s) {
		while (true) {
			//	String s = read();
				String tokens[] = s.split("\\s");

				// Don't write it if it does contain the noise word
				if (Arrays.asList(noise).contains(tokens[0].toLowerCase()))
					continue;
		}
	}
}

