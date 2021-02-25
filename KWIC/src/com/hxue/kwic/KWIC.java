package com.hxue.kwic;
import java.util.Scanner;

public class KWIC extends Filter{
		
    public String KWIC(String input)
    {
    	String line = "";
		Scanner scanner = new Scanner(input);
		while(scanner.hasNextLine()) {
			line = scanner.nextLine();
			/*Filter filter = null;
			Pipe p0 = new Pipe();
			filter.setOut(p0);
			CircularShifter shift = new CircularShifter();
			Pipe p1 = new Pipe();
			shift.setOut(p1);
			Alphabetizer sort = new Alphabetizer();
			Pipe p2 = new Pipe();
			sort.setIn(p2);*/
		}
		return line + "++++";
		
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	

}

