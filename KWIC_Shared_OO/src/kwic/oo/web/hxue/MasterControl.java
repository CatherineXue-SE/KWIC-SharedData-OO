package kwic.oo.web.hxue;

import java.io.InputStream;
import java.io.OutputStream;

public class MasterControl
	{
	    private String in;
	    private OutputStream out;
	    public MasterControl (InputStream in, OutputStream out) {}
	    
	    /**
	     * Performs a number of operations in batch style to accomplish
	     * the goals of the program.
	     */
	    public void kwic () 
	    {
	        // Note that here ch should be the same object used 
	        // across all functions (ie, pass by reference, or whatever
	        // Java's equivalent is [my Java is hazy]).
	    	LineStorage ch = new LineStorage();
	        
	        input in = new input(this.in, ch);
	        while (in.read() >= 0) {}
	        
	        CircularShift cshift = new CircularShift(ch);
	        cshift.setup();
	        
	        Alphabetizer ashifts = new Alphabetizer(cshift);
	        ashifts.alph();
	        
	        Output out = new Output(this.out, ashifts);
	        out.write();
	    }
	}