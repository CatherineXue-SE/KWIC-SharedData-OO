package kwic.oo.web.hxue;
//Input.java
//uses Characters
import java.io.InputStream;

public class input extends InputStream
{
 /**
  * The Characters object Input is putting lines in.
  */
 private LineStorage ch;
 
 /**
  * Creates the Input object inits the Characters object to point
  * to the object it's using.
  */
 public input (String in, LineStorage ch) {
	 
 }
 
 /**
  * Reads a character from the InputStream. Returns -1 if no more characters
  * to read, or a number greater than or equal to 0 if a character was read.
  */
 public int read () {
	 return 0;
 }
}