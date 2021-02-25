package com.hxue.kwic;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KWIC {
		
	 static String finaloutput="";
    public String parse(String input) throws EOFException
    {
    	Filter newoutput = new OutputFilter();
		    steps newstep = new steps(
		    		new InputFilter(input),
					new CircularShifter(),
					new Alphabetizer(),
					new OutputFilter()
					);
			Thread thread = new Thread(newstep);;
			thread.run();
			
		
		return  getOutput();//newoutput.read();//newoutput.read().toString();
		
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

