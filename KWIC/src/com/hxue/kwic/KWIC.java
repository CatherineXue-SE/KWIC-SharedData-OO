package com.hxue.kwic;
import java.io.EOFException;

public class KWIC {
		
    public String parse(String input) throws EOFException
    {
			/*Pipe p0 = new Pipe();
			input newinput = new input(input);
			newinput.exportdata(p0);
			newinput.run();
			Filter shift = new CircularShifter();
			
			shift.importdata(p0);
			//shift.exportdata(p1);
			shift.run();
			System.out.println(shift.read());
			/*Filter sort = new Alphabetizer();
			Pipe p2 = new Pipe();
			sort.importdata(p1);
			sort.exportdata(p2);
			sort.run();
			Filter output = new output();
			Pipe p3 = new Pipe();
			output.importdata(p2);
			output.exportdata(p3);
			output.read();*/
			output newoutput =  new output();
			new steps(new input(input),
					new CircularShifter(),new Alphabetizer(), newoutput).run();
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
		
		return  newoutput.outputValue() +  "++++";
		
    }

	

}

