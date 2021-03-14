package kwic.oo.web.hxue;
// AlphabeticShifts.java
// uses CircularShift
/**
 * Provides access to an alphabetized version of the circular
 * shifts. May not necessarily need to store the alphabetized
 * ordering locally (Parnas didn't in his original paper).
 */
public class Alphabetizer
{
    /**
     * Creates the AlphabeticShifts data structure and this object.
     */
    public Alphabetizer (CircularShift cshift) {}

    /**
     * Called before the other function (ith) will have a 
     * defined value. Should alphabetize the circular shifts.
     */
    public void alph() {}

    /**
     * Get the index of the circular shift which comes ith in the
     * alphabetized ordering.
     */
    public int ith(int i) {
    	return 0;
    }
}
