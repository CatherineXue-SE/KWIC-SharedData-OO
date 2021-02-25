package com.hxue.kwic;
import java.io.EOFException;

public class KWIC {
		
    public String parse(String input) throws EOFException
    {
			output newoutput =  new output();
			Pipe p0 = new Pipe();
			input newinput = new input(input);
			newinput.exportdata(p0);
			newinput.run();
			Pipe p1 = new Pipe();
			Filter shift = new CircularShifter();
			shift.importdata(p0);
			shift.exportdata(p1);
			shift.run();
			Filter sort = new Alphabetizer();
			Pipe p2 = new Pipe();
			sort.importdata(p1);
			sort.exportdata(p2);
			sort.run();
			//newinput.exportdata(p1);
			//Pipe p2 = new Pipe();
			//Filter sort = new Alphabetizer();
			//shift.exportdata(p2);
			//sort.importdata(p2);
			//shift.run();
			//steps newsteps = new steps(new input(input),new CircularShifter(),new Alphabetizer(),newoutput);
			//System.out.print(newoutput.outputValue());
			//Thread thread = new Thread(newsteps);;
			//thread.run();
			/*Filter filter = null;
			Pipe p0 = new Pipe();
			filter.setOut(p0);
			CircularShifter shift = new CircularShifter();
			Pipe p1 = new Pipe();
			shift.setOut(p1);
			Alphabetizer sort = new Alphabetizer();
			Pipe p2 = new Pipe();
			sort.setIn(p2);*/
		
		return  "";//newoutput.outputValue() +  "++++";
		
    }

	

}

