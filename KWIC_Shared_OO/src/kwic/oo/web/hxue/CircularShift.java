package kwic.oo.web.hxue;
import java.io.EOFException;


/**
* "The module creates the impression that we have created a line 
*  holder containing not all of the lines but all of the circular
*  shifts of the lines." - Parnas
*
* This module doesn't actually hold all the data. It doesn't need to,
* as it can generate them on the fly using the Characters object.
*/
public class CircularShift
{
 /**
  * Creates the CircularShift data structure and this object.
  */
 public CircularShift (LineStorage ch) {}

 /**
  * Called before the other functions have their values.
  */
 public void setup() {}

 /**
  * Sets cth character of wth word of rth circular shift to 
  * character d.
  */
 public void setchar(int r, int w, int c, char d) {}
 
 /**
  * Gets the cth character in the rth circular shift, wth word.
  */
 public char getchar (int r, int w, int c) {
	 return (Character) null;
 }
 
 /**
  * Get the number of words in the rth circular shift.
  */
 public String word (int r) {
	return null;}
}



	/*
	private void shiftLeft(String[] array) {
		String temp = array[0];
		int i;
		for (i = 0; i < array.length - 1; i++)
			array[i] = array[i + 1];
		array[i] = temp;
	}*/

