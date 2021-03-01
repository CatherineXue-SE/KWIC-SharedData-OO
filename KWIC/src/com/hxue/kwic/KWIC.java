package com.hxue.kwic;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KWIC {
		
	 static String finaloutput="";
	 static int count = 0;
	 static int numofraws = 0;
    public String parse(String input) throws EOFException
    {
    	
    	count = 0;
		String[] raws = input.split("\\r?\\n");
		numofraws = raws.length;
		for(String line: raws)
		{
			count+= line.trim().split("\\s").length;
		}
		finaloutput = "";

		    steps newstep = new steps(
		    		new InputFilter(input),
					new Alphabetizer(),

					new CircularShifter(),
					new OutputFilter()
					);
			Thread thread = new Thread(newstep);;
			thread.run();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return  getOutput();
		
    }
   
    public static void setOutput(String addinput)
    {
    	finaloutput =addinput;
    	System.out.println(finaloutput);
    }
  
    public static String getOutput()
    {
    	return finaloutput;
    }
  

	

}

